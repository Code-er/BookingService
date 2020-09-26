package com.cg.omts.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.omts.Booking.dto.TicketDTO;
import com.cg.omts.Booking.entity.Booking;
import com.cg.omts.Booking.entity.Seats;
import com.cg.omts.Booking.entity.Show;

public interface BookingService {

	Booking addBooking(int movieId,Show showref,double totalCost,int transactionId,List<Seats> seats);
	
	int makePayment(String cardNumber,String cvv,LocalDate expiry);
	
	Booking viewBookingById(int bookingId);
	
	boolean cancelBookings(int bookingId);
	
	

}
