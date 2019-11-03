package com.balindra.flightcheckin.integration;

import com.balindra.flightcheckin.integration.dto.Reservation;
import com.balindra.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest resvUpdateRequest);

}
