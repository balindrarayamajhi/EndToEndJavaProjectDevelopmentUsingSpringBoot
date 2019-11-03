package com.balindra.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.balindra.flightcheckin.integration.ReservationRestClient;
import com.balindra.flightcheckin.integration.dto.Reservation;
import com.balindra.flightcheckin.integration.dto.ReservationUpdateRequest;


@Controller
public class CheckInController {
	
	
	@Autowired 
	private ReservationRestClient restClient;
	

	
	@RequestMapping("/showstartcheckin")
	public String getcheckIn() {
		return "startcheckin";
	}
	
	
	@RequestMapping(value="/startcheckin")
	public String startCheckIn(@RequestParam("reservationId") long reservationId,Model model) {
		
		Reservation reservation = restClient.findReservation(reservationId);
		model.addAttribute("reservation", reservation);
		return "reservationdetails";
		
	}
	
	@RequestMapping("/completecheckin")
	public String completeCheckIn(@RequestParam("reservationId") long reservationId,@RequestParam("numOfBags") int numOfBags, Model model) {
		
		ReservationUpdateRequest revsUpdReq=new ReservationUpdateRequest();
		revsUpdReq.setReservationId(reservationId);
		revsUpdReq.setCheckedIn(true);
		revsUpdReq.setNumberOfBags(numOfBags);
		Reservation reservation=restClient.updateReservation(revsUpdReq);
		model.addAttribute("reservation",reservation);
		return "chechinconfirm";
		
		
		
	}
			
}
