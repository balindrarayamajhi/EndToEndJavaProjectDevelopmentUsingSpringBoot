package com.balindra.flightcheckin.integration.dto;


import java.util.Date;


public class Flight  {
	
	
	private long id;
	private String fightnumber;
	private String operatingAirline;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Date estimatedDepartureTime;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	
	

}
