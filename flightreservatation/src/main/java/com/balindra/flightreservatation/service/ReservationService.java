package com.balindra.flightreservatation.service;

import java.util.List;

import com.balindra.flightreservatation.dto.ReservationRequest;
import com.balindra.flightreservatation.entity.Reservation;



public interface ReservationService {
	
	Reservation getReservationById(long id);
	Reservation saveReservation(Reservation reservation);
	Reservation updateReservation(Reservation reservation);
	void deleteReservation(Reservation reservation);
	List<Reservation> getAllReservations();
	void deleteReservation(long id);
	Reservation bookFLight(ReservationRequest revsrequest);
}
