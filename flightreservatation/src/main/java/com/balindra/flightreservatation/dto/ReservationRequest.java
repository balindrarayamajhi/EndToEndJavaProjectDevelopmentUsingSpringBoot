package com.balindra.flightreservatation.dto;

public class ReservationRequest{
	private Long flightId;
	private String passengerfirstname;
	private String passengerlastname;
	private String passengeremail;
	private String passengerphone;
	private String nameoncard;
	private String cardnumber;
	private String expiredate;
	private String securitycode;
	
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getPassengerfirstname() {
		return passengerfirstname;
	}
	public void setPassengerfirstname(String passengerfirstname) {
		this.passengerfirstname = passengerfirstname;
	}
	public String getPassengerlastname() {
		return passengerlastname;
	}
	public void setPassengerlastname(String passengerlastname) {
		this.passengerlastname = passengerlastname;
	}
	public String getPassengeremail() {
		return passengeremail;
	}
	public void setPassengeremail(String passengeremail) {
		this.passengeremail = passengeremail;
	}
	public String getPassengerphone() {
		return passengerphone;
	}
	public void setPassengerphone(String passengerphone) {
		this.passengerphone = passengerphone;
	}
	public String getNameoncard() {
		return nameoncard;
	}
	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	
	public String getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}
	public String getSecuritycode() {
		return securitycode;
	}
	public void setSecuritycode(String securitycode) {
		this.securitycode = securitycode;
	}
	@Override
	public String toString() {
		return "ReservationRequest [flightId=" + flightId + ", passengerfirstname=" + passengerfirstname
				+ ", passengerlastname=" + passengerlastname + ", passengeremail=" + passengeremail
				+ ", passengerphone=" + passengerphone + ", nameoncard=" + nameoncard + ", expiredate=" + expiredate
				+ "]";
	}
	
	
	
}
