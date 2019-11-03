package com.balindra.flightreservatation.service;

import java.util.List;


import com.balindra.flightreservatation.entity.Passenger;

public interface PassengerService {
	Passenger getPassengerById(long id);
	Passenger savePassenger(Passenger passenger);
	Passenger updatePassenger(Passenger passenger);
	void deletePassenger(Passenger passenger);
	List<Passenger> getAllPassengers();
	void deletePassenger(long id);

}
