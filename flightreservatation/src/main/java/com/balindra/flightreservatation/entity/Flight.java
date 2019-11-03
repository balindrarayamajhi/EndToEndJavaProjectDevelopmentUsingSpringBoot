package com.balindra.flightreservatation.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Flight extends AbstractEntity {
	
	
	@Column(nullable=false,unique=true)
	private String fightnumber;
	private String operatingAirline;
	private String departureCity;
	private String arrivalCity;
	@Temporal(TemporalType.DATE)
	private Date dateOfDeparture;
	
	private Date estimatedDepartureTime;
	
	
	public String getFightnumber() {
		return fightnumber;
	}
	public void setFightnumber(String fightnumber) {
		this.fightnumber = fightnumber;
	}
	
	
	public String getOperatingAirline() {
		return operatingAirline;
	}
	public void setOperatingAirline(String operatingAirlines) {
		this.operatingAirline = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Date getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Date estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	@Override
	public String toString() {
		return "Flight [id="+super.getId()+", fightnumber=" + fightnumber + ", operatingAirline=" + operatingAirline + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture
				+ ", estimatedDepartureTime=" + estimatedDepartureTime + "]";
	}
	
	

}
