package com.cg.omts.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.omts.Booking.dao.BookingDao;
import com.cg.omts.Booking.dao.SeatsDao;

import com.cg.omts.Booking.entity.Booking;
import com.cg.omts.Booking.entity.Seats;
import com.cg.omts.Booking.entity.Show;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookingdao;

	@Autowired
	SeatsDao seatsdao;

	@Override
	public boolean cancelBookings(int bookingId) {
		if (bookingdao.existsById(bookingId)) {
			bookingdao.deleteById(bookingId);
		}

		return true;
	}

	@Override
	public Booking addBooking(int movieId, Show showref, double totalCost, int transactionId, List<Seats> seats) {
	    
		Booking booking =new Booking(movieId,showref,LocalDate.now(),totalCost,seats);
		return bookingdao.save(booking);

	}

	@Override
	public int makePayment(String cardNumber, String cvv, LocalDate expiry) {

		int transactionId=0;
		if (cardNumber.matches("\\d{16}") && cvv.matches("\\d{3}") && expiry.compareTo(LocalDate.now()) > 0) 
		{
			transactionId = (int) (Math.random() * 99999999);
			if (transactionId<= 10000000) {
				transactionId = transactionId + 10000000;
			}
		}
		return transactionId;
	}

	@Override
	public Booking viewBookingById(int bookingId) {
		
		return bookingdao.findById(bookingId).get();
	}

}
