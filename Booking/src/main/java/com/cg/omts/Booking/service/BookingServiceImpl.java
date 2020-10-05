package com.cg.omts.Booking.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.omts.Booking.dao.BookingDao;

import com.cg.omts.Booking.entity.Booking;
import com.cg.omts.Booking.exceptions.CustomException;
import com.cg.omts.Booking.validations.Validation;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookingdao;
	
	Validation validation=new Validation();


	@Override
	public Booking addBooking(Booking booking) {
        return bookingdao.save(booking);
	}

	@Override
	public int makePayment(String cardNumber, String cvv, LocalDate expiry) {

		int transactionId = 0;
		if (validation.isValidCardNumber(cardNumber) && validation.isValidCvv(cvv) && validation.isValidExpiryDate(expiry)) {
			
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

	@Override
	public List<Booking> getAllBookingsByCustomerId(String userName) {
		return bookingdao.findAllByUserName(userName);
	}

}
