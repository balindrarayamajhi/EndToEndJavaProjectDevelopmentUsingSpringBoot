package com.balindra.flightreservatation.service;

import java.util.List;

import java.util.Optional;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.balindra.flightreservatation.controller.ReservationController;
import com.balindra.flightreservatation.dto.ReservationRequest;
import com.balindra.flightreservatation.entity.Flight;
import com.balindra.flightreservatation.entity.Passenger;
import com.balindra.flightreservatation.entity.Reservation;
import com.balindra.flightreservatation.repos.FlightRepository;
import com.balindra.flightreservatation.repos.PassengerRepository;
import com.balindra.flightreservatation.repos.ReservationRepository;
import com.balindra.flightreservatation.util.EmailUtil;
import com.balindra.flightreservatation.util.PdfGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {

	private static final Logger LOGGER=LoggerFactory.getLogger(ReservationServiceImpl.class);
	
	@Autowired
	private ReservationRepository reservationrepo;
	

	@Autowired
	private FlightRepository flightrepo;
	
	@Autowired
	private PassengerRepository passengerrepo;
	
	@Autowired 
	private  PdfGenerator pdfGenerator;
	
	@Autowired 
	private  EmailUtil emailUtil;
	

	@Autowired 
	private ServletContext sc;
	
	//@Value("${}")
	private String ITINERARY_DIR ="${itinerary.dirpath}";
	@Override
	public Reservation getReservationById(long id) {
		LOGGER.info("Inside getReservationById()");
		Optional<Reservation> reservation=reservationrepo.findById(id);
		LOGGER.info("Fetching reservation for id : "+id);
		if(reservation.isPresent())
			return reservation.get();
		
		throw new RuntimeException("Reservation with id "+id+ "does not exist.");
		
	}

	@Override
	public Reservation saveReservation(Reservation reservation) {
		
		LOGGER.info("Inside saveReservation() method reservation");
		LOGGER.info("Saving Reservation " +reservation);
		return reservationrepo.save(reservation);
		
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		LOGGER.info("Inside upadteReservation() method");
		LOGGER.info("Updating Reservation " +reservation);

		Reservation savedreservation= reservationrepo.save(reservation);
		
		return savedreservation;
	}

	@Override
	public void deleteReservation(Reservation reservation) {
		LOGGER.info("Inside deleteeReservation() method");
		LOGGER.info("Deleting Reservation " +reservation);
		reservationrepo.delete(reservation);

	}

	@Override
	public List<Reservation> getAllReservations() {
		LOGGER.info("Inside getAllReservations() method reservation : ");
		LOGGER.info("Fetching all reservations");
		 return reservationrepo.findAll();
	}

	@Override
	public void deleteReservation(long id) {
		LOGGER.info("Inside deleteReservation() method ");
		LOGGER.info("Deleting reservation of id : "+id);
		reservationrepo.deleteById(id);
	}

	@Override
	@Transactional
	public Reservation bookFLight(ReservationRequest revsrequest) {
		
		LOGGER.info("Inside  bookFLight()");
		
		
		long flightId=revsrequest.getFlightId();
		LOGGER.info("Fetching Flight for Flightd : "+revsrequest.getFlightId());
		Flight flight= flightrepo.findById(flightId).get();
		
		Passenger passenger= new Passenger();
		
		passenger.setFirstname(revsrequest.getPassengerfirstname());
		passenger.setLastname(revsrequest.getPassengerlastname());
		passenger.setEmail(revsrequest.getPassengeremail());
		passenger.setPhone(revsrequest.getPassengerphone());
		LOGGER.info("Saving Passenger  : "+passenger);
		Passenger savedPassenger =passengerrepo.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setPassenger(savedPassenger);
		reservation.setFlight(flight);
		reservation.setCheckedin(false);
		LOGGER.info("Saving reservation "+reservation);
		Reservation savedreservation=reservationrepo.save(reservation);
		
		
		String filepath = sc.getRealPath("/")+ITINERARY_DIR+savedreservation.getId()+".pdf";
		LOGGER.info("Generating the itinerary"+reservation);
		pdfGenerator.generateItenary(savedreservation, filepath);
		LOGGER.info("Emailing the itinerary"+reservation);
		emailUtil.sendItinerary(passenger.getEmail(), filepath);
		
		return savedreservation;
		
	}

}
