package com.balindra.flightreservatation.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity

public class Reservation extends AbstractEntity{
	
	private boolean checkedin;
	private int numberofbags;
	
	@OneToOne
	private Passenger passenger;
	
	@OneToOne
	private Flight flight;
	
	public boolean isCheckedin() {
		return checkedin;
	}
	public void setCheckedin(boolean checkedin) {
		this.checkedin = checkedin;
	}
	public int getNumberofbags() {
		return numberofbags;
	}
	public void setNumberofbags(int numberofbags) {
		this.numberofbags = numberofbags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@Override
	public String toString() {
		return "Reservation [ id="+super.getId()+", checkedin=" + checkedin + ", numberofbags=" + numberofbags + ", passenger=" + passenger
				+ ", flight=" + flight + "]";
	}
	
	
	

}
