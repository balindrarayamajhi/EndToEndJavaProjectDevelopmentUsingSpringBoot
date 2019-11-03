package com.balindra.flightreservatation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balindra.flightreservatation.entity.Passenger;
import com.balindra.flightreservatation.repos.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	private PassengerRepository prepo;

	@Override
	public Passenger getPassengerById(long id) {
		Optional<Passenger> passenger=prepo.findById(id);
		if(passenger.isPresent())
			return passenger.get();
		
		throw new RuntimeException("Passenger with id "+id+ "does not exist.");
		
	
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		return prepo.save(passenger);
	}

	@Override
	public Passenger updatePassenger(Passenger passenger) {
		return prepo.save(passenger);
	}

	@Override
	public void deletePassenger(Passenger passenger) {
		 prepo.delete(passenger);

	}

	@Override
	public List<Passenger> getAllPassengers() {
		return prepo.findAll();
	}

	@Override
	public void deletePassenger(long id) {
		 prepo.deleteById(id);

	}

}
