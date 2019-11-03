package com.balindra.flightreservatation.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balindra.flightreservatation.entity.Flight;
import com.balindra.flightreservatation.repos.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	
	@Autowired 
	private FlightRepository flightrepo;
	
	@Override
	public Flight getFlightById(long id) {
		Optional<Flight> flight=flightrepo.findById(id);
		if(flight.isPresent())
			return flight.get();
		
		throw new RuntimeException("Flight with id "+id+ "does not exist.");
		
	}

	@Override
	public Flight saveFlight(Flight flight) {
		
		return flightrepo.save(flight);
	}

	@Override
	public Flight updateFlight(Flight flight) {
		
		return flightrepo.save(flight);
	}

	@Override
	public void deleteFlight(Flight flight) {
		flightrepo.delete(flight);

	}

	@Override
	public List<Flight> getAllFlights() {
		
		return flightrepo.findAll();
	}

	@Override
	public void deleteFlight(long id) {
		flightrepo.deleteById(id);

	}

	@Override
	public List<Flight> findFlights(String from, String to, Date depdate) {
		//String date=new SimpleDateFormat("yyyy-mm-dd").format(depdate);
//		System.out.println("\n************************");
//		System.out.println(date);
//		System.out.println("\n************************");
		return flightrepo.findlights(from,to,depdate);
	}

}
