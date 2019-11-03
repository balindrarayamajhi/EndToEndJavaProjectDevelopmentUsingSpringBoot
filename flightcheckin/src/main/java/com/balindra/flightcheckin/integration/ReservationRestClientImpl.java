package com.balindra.flightcheckin.integration;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.balindra.flightcheckin.integration.dto.Reservation;
import com.balindra.flightcheckin.integration.dto.ReservationUpdateRequest;


@Component
public class ReservationRestClientImpl implements ReservationRestClient {
	
	private static final String FLIGHTRESERVATION_REST_URL = "http://localhost:9001/flightreservation/reservations/";

	@Autowired 
	RestTemplate restTemplate;

	@Override
	public Reservation findReservation(Long id) {
		
		
		
		
		//Reservation reservation = 
		return restTemplate.getForObject(FLIGHTRESERVATION_REST_URL+id, Reservation.class);
		
		//return reservation;
	}

	
	@Override
	public Reservation updateReservation(ReservationUpdateRequest resvUpdateRequest) {
		
		
		
		//Reservation reservation = 
		return restTemplate.postForObject(FLIGHTRESERVATION_REST_URL+"update", resvUpdateRequest, Reservation.class);
		
		//return reservation;
	}

}
