package com.cg.omts.Booking.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.omts.Booking.entity.Booking;


public interface BookingService {

	public Booking addBooking(Booking booking);
	
	int makePayment(String cardNumber,String cvv,LocalDate expiry);
	
	Booking viewBookingById(int bookingId);
	
	boolean cancelBookings(int bookingId);
	
	List<Booking> getAllBookingsByCustomerId(String userName);
	
	

}
