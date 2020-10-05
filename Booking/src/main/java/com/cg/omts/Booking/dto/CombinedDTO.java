 package com.cg.omts.Booking.dto;

import com.cg.omts.Booking.entity.Booking;

public class CombinedDTO {
	
	private Booking booking;
	private CardDetailsDTO carddetails;
	
	
	public CombinedDTO(Booking booking, CardDetailsDTO carddetails) {
		super();
		this.booking = booking;
		this.carddetails = carddetails;
	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	public CardDetailsDTO getCarddetails() {
		return carddetails;
	}


	public void setCarddetails(CardDetailsDTO carddetails) {
		this.carddetails = carddetails;
	}
	
	

}
