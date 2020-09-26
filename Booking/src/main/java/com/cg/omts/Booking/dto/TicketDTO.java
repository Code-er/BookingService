package com.cg.omts.Booking.dto;

import java.util.List;

import com.cg.omts.Booking.entity.Booking;

public class TicketDTO {
    int  ticketId;
	int noOfSeats;
    List<String> seatName;
	Booking	bookingRef;
	Boolean ticketStatus;
    String screenName;
	public TicketDTO(int ticketId, int noOfSeats, List<String> seatName, Booking bookingRef, Boolean ticketStatus,
			String screenName) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatName = seatName;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
		this.screenName = screenName;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public List<String> getSeatName() {
		return seatName;
	}
	public void setSeatName(List<String> seatName) {
		this.seatName = seatName;
	}
	public Booking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}
	public Boolean getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(Boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
    
    	


}
