package com.balindra.flightreservatation.repos;

import java.util.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.balindra.flightreservatation.entity.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long> {

	
	//@Query("FROM Flight WHERE LOWER(departureCity)=LOWER(:departureCity) AND LOWER(arrivalCity)=LOWER(:arrivalCity) AND dateOfDeparture=:dateOfDeparture")
	@Query("FROM Flight WHERE departureCity=:departureCity AND arrivalCity=:arrivalCity AND dateOfDeparture=:dateOfDeparture")
	List<Flight> findlights(@Param("departureCity")String from,@Param("arrivalCity")String to, @Param("dateOfDeparture")Date depdate);

}
