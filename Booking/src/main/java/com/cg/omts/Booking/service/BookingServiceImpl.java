package com.cg.omts.Booking.service;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.omts.Booking.dao.BookingDao;

import com.cg.omts.Booking.entity.Booking;
import com.cg.omts.Booking.exceptions.CustomException;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookingdao;

	@Override
	public Booking addBooking(Booking booking) {
    
	
		Booking objBooking= bookingdao.save(booking);
		if(objBooking==null)
			throw new CustomException("Booking not stored successfully " );
        return objBooking;
	}

	@Override
	public int makePayment(String cardNumber, String cvv, LocalDate expiry) {

		int transactionId = 0;
		if (cardNumber.matches("\\d{16}") && cvv.matches("\\d{3}") && expiry.compareTo(LocalDate.now()) > 0) {
			
			transactionId = (int) (Math.random() * 99999999);    // Math.random() generates number b/w 0-1
			if (transactionId <= 10000000) {                       // This Overall generates 8 digit transactionId once payments details are verified
			      transactionId = transactionId + 10000000;
			}
		}
		
		else
		{
			throw new CustomException("Payment Not validated " );
		}
		return transactionId;
	}

	@Override
	public Booking viewBookingById(int bookingId) {

		Booking booking = bookingdao.findById(bookingId).orElse(null);
		if (booking == null) {
			throw new CustomException("No Booking Found with Booking ID : " + bookingId);
		} else {
			return booking;
		}
	}

	@Override
	public boolean cancelBookings(int bookingId) {
		if (bookingdao.existsById(bookingId)) {
			bookingdao.deleteById(bookingId);
		} else {
			throw new CustomException("No Booking Found with Booking ID : " + bookingId);
		}

		return true;
	}

}
