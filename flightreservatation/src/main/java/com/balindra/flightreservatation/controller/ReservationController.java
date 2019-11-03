package com.balindra.flightreservatation.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.balindra.flightreservatation.entity.Flight;
import com.balindra.flightreservatation.entity.Reservation;
import com.balindra.flightreservatation.dto.ReservationRequest;
import com.balindra.flightreservatation.service.FlightService;
import com.balindra.flightreservatation.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired 
	private ReservationService rservice;
	
	@Autowired
	private FlightService fservice;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(ReservationController.class);
	
	@RequestMapping("/showcompletereservation")
	public String showReservation(@RequestParam("flightId") long flightId,@ModelAttribute("revsrequest")ReservationRequest revreq, Model model){
		LOGGER.info("Inside showReservation() method - flightId :{} and reservationrequest :{}",flightId,revreq);
		Flight flight=fservice.getFlightById(flightId);
		
		model.addAttribute("flight",flight);
		LOGGER.info("Flight is "+flight);
		return "completereservation";
		
	}
	
	
	@RequestMapping(value="/completereservation",method=RequestMethod.POST)
	public String completeReservation(@ModelAttribute("revsrequest") ReservationRequest revsrequest, Model model ) {
		LOGGER.info("Inside completeReservation() method - reservationrequest :{}",revsrequest);
		Reservation reservation= rservice.bookFLight(revsrequest);
		model.addAttribute("msg", "Reservation is made sucessfully with id : "+reservation.getId());
		LOGGER.info("Returned : " +reservation);
		return "reservationconfirmation";
	}

}
