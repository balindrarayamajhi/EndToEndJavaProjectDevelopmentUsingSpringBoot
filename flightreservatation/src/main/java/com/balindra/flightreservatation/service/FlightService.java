package com.balindra.flightreservatation.service;

import java.util.Date;
import java.util.List;

import com.balindra.flightreservatation.entity.Flight;

public interface FlightService {

	Flight getFlightById(long id);
	Flight saveFlight(Flight flight);
	Flight updateFlight(Flight flight);
	void deleteFlight(Flight flight);
	List<Flight> getAllFlights();
	void deleteFlight(long id);
	List<Flight> findFlights(String from, String to, Date depdate);
}
