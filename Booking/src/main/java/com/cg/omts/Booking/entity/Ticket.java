package com.cg.omts.Booking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	private int noOfSeats;
	private String seatName;
	private int bookingRef;
	private boolean ticketStatus;
	private String screenName;

	public Ticket() {
		super();
	}

	public Ticket( int noOfSeats, String seatName, int bookingRef, boolean ticketStatus,
			String screenName) {
		super();
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

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

	public int getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(int bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatName=" + seatName + ", bookingRef="
				+ bookingRef + ", ticketStatus=" + ticketStatus + ", screenName=" + screenName + "]";
	}

}
