package com.cg.omts.Booking.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.omts.Booking.dto.TicketDTO;
import com.cg.omts.Booking.entity.Seats;
import com.cg.omts.Booking.entity.Show;
import com.cg.omts.service.BookingService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookingController {

	@Autowired
	BookingService bookingservice;
	
	@PostMapping(value="/chooseSeats")
	public List<Seats> chooseSeats(@RequestBody List<Integer> seatIds)
	{
		
		bookingservice.chooseSeats(seatIds);
	}

	TicketDTO showTicket(int bookingId)
	{
		
	}

	public double calculateTotalCost(List<Seats> seatPrices)
	{
		
	}

	String choosePaymentMethod(int option)
	{
		
	}

	boolean cancelBookings(List<Seats> seats)
	{
		
	}
	
	public boolean makeBooking(int movieId,Show showref,LocalDate bookingDate,double totalCost,List<Seats> seatList)
	{
		
	}
}
