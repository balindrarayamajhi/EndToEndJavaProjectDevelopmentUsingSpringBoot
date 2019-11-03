package com.balindra.flightreservatation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balindra.flightreservatation.entity.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
