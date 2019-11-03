package com.balindra.flightreservatation.controller;


import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.balindra.flightreservatation.entity.Flight;
import com.balindra.flightreservatation.service.FlightService;


@Controller
public class FlightController {
	
	@Autowired
	private FlightService fservice;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(FlightController.class);
	
	@RequestMapping(value="/findflight",method=RequestMethod.POST)
	public String findFlight(@RequestParam("from") String from,@RequestParam("to") String to, @RequestParam("depdate")@DateTimeFormat(pattern="MM-dd-yyyy")Date depdate,Model model) {
		
		LOGGER.info("Inside findFlight() method from : {} to :{} and departure date :{}",from,to,depdate);
		
		List<Flight> flights=fservice.findFlights( from, to,depdate);
		model.addAttribute("flights", flights);
		
		LOGGER.info("Flights found are "+flights);
		return "displayflights";
	}
	
	@RequestMapping("/addFlight")
	public String ShowAddFlight(@ModelAttribute("flight") Flight flight) {
		return "addflight";
	}
	

}
