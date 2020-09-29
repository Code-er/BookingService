package com.cg.omts.Booking.controller;

import java.time.LocalDate;
import java.util.List;

import javax.ws.rs.Consumes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.omts.Booking.entity.Booking;
import com.cg.omts.Booking.service.BookingService;


@RestController
public class BookingController {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	BookingService bookingservice;
	
	//@Consumes("application/json")
	@PostMapping(value="/addBooking")
	public Booking addBooking(@RequestBody Booking booking  )
	{
		logger.info("Adding bookinddetails to database");
		return bookingservice.addBooking(booking);
	}
	
	@PostMapping(value="/makePayment")
	public int makePayment(@RequestBody String cardNumber, String cvv, LocalDate expiry)
	{
		logger.info("Validating payments ");
		return bookingservice.makePayment(cardNumber, cvv, expiry);
	}
	
	@GetMapping(value="/viewBookingById/{bookingId}")
	public Booking viewBookingById(@PathVariable int bookingId)
	{
		logger.info("View Booking by particular id");
		return bookingservice.viewBookingById(bookingId);
		
	}
	
	@DeleteMapping(value="/chooseSeats")
	public boolean cancelBookings(@RequestBody int bookingId)
	{
		logger.info("Removing bookinddetails from database");
		return bookingservice.cancelBookings(bookingId);
	}

	
}
