package com.balindra.flightreservatation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balindra.flightreservatation.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
