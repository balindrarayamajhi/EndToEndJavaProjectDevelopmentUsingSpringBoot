package com.balindra.flightreservatation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balindra.flightreservatation.dto.ReservationUpdateRequest;
import com.balindra.flightreservatation.entity.Reservation;
import com.balindra.flightreservatation.service.ReservationService;

@RestController
@RequestMapping("/reservations")
@CrossOrigin
public class ReservationRestController {
	
	private static Logger LOGGER= LoggerFactory.getLogger(ReservationRestController.class);
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/{id}")
	public Reservation findReservation(@PathVariable("id")long id) {
		LOGGER.info("Inside method findReservation() find for id : ",+id );
		return reservationService.getReservationById(id);
		
	}
	
	@PostMapping("/update")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest revsUpdateRequest) {
		
		LOGGER.info("Inside method updateReservation() for : "+revsUpdateRequest );
		Reservation reservation=reservationService.getReservationById(revsUpdateRequest.getReservationId());
		reservation.setCheckedin(revsUpdateRequest.isCheckedIn());
		reservation.setNumberofbags(revsUpdateRequest.getNumberOfBags());
		LOGGER.info("Saving Reservation : "+reservation);
		return reservationService.saveReservation(reservation);
	}

}
