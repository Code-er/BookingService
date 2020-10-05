
package com.cg.omts.Booking.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.omts.Booking.dto.BookingDTO;
import com.cg.omts.Booking.dto.CardDetailsDTO;
import com.cg.omts.Booking.dto.CombinedDTO;
import com.cg.omts.Booking.dto.ShowDTO;
import com.cg.omts.Booking.entity.Booking;
import com.cg.omts.Booking.entity.Ticket;
import com.cg.omts.Booking.exceptions.CustomException;
import com.cg.omts.Booking.service.BookingService;

@RestController
@CrossOrigin("http://localhost:4200")
public class BookingController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	BookingService bookingservice;

	@Autowired
	RestTemplate restTemplate;

	// @Consumes("application/json")
	@PostMapping(value = "/addBooking")
	public Ticket addBooking(@RequestBody CombinedDTO combined) {
		logger.info("Adding bookinddetails to database");
		Ticket ticketobj;

		Booking booking = combined.getBooking(); // Only contains movieId,showId and No of seats

		try {
			String urlShow = "http://localhost:1114/show/bookseats/" + booking.getShowId() + "/"
					+ booking.getNoOfSeats();
			ShowDTO show = restTemplate.getForEntity(urlShow, ShowDTO.class).getBody();

			CardDetailsDTO card = combined.getCarddetails();
			int transactionid = bookingservice.makePayment(card.getCardNumber(), card.getCvv(), card.getExpiryDate());
			booking.setTransactionId(transactionid);

			booking.setBookingDate(LocalDate.now());
			booking.setTotalCost(booking.getNoOfSeats() * 220.0);

			bookingservice.addBooking(booking);
			Ticket ticket = new Ticket(booking.getNoOfSeats(), "DefaultSeat Name", booking.getBookingId(), true,
					"Default ScreenName");
			String urlTicket = "http://localhost:1113/ticket/generateTicket/"; // Send Booking Object ??
			ticketobj = restTemplate.postForEntity(urlTicket, ticket, Ticket.class).getBody();
		}

		catch (Exception e) {
			throw new CustomException(e.getMessage());
		}
		return ticketobj;

	}

	@GetMapping(value = "/viewBookingById/{bookingId}")
	public BookingDTO viewBookingById(@PathVariable int bookingId) {
		logger.info("View Booking by particular id");
		return convertToBookingDTO(bookingservice.viewBookingById(bookingId));

	}

	@DeleteMapping(value = "/cancelBooking/{bookingId}")
	public boolean cancelBooking(@PathVariable int bookingId) {
		logger.info("Removing bookinddetails from database");
		return bookingservice.cancelBookings(bookingId);
	}
	
	@GetMapping(value="/getAllBookingsByCustomerId/{userName}")
	public List<BookingDTO> getAllBookingsByCustomerId(@PathVariable String userName)
	{
		List<Booking> allBookings=bookingservice.getAllBookingsByCustomerId(userName);
		List<BookingDTO> allbookingdtos=new ArrayList<BookingDTO>();
		for(Booking booking:allBookings)
		{
			allbookingdtos.add(convertToBookingDTO(booking));
		}
		return allbookingdtos;
	}
	
	public Booking convertToBooking(BookingDTO bookingdto)
	{
		Booking booking=new Booking();
		booking.setUserName(bookingdto.getUserName());
		booking.setBookingId(bookingdto.getBookingId());
		booking.setShowId(bookingdto.getShowId());
		booking.setBookingDate(bookingdto.getBookingDate());
		booking.setNoOfSeats(bookingdto.getNoOfSeats());
		booking.setTransactionId(bookingdto.getTransactionId());
		booking.setMovieId(bookingdto.getMovieId());
		booking.setTotalCost(bookingdto.getTotalCost());
		return booking;
	}
	
	public BookingDTO convertToBookingDTO(Booking booking)
	{
		
		BookingDTO bookingdto=new BookingDTO();
		bookingdto.setUserName(booking.getUserName());
		bookingdto.setBookingId(booking.getBookingId());
		bookingdto.setShowId(booking.getShowId());
		bookingdto.setBookingDate(booking.getBookingDate());
		bookingdto.setNoOfSeats(booking.getNoOfSeats());
		bookingdto.setTransactionId(booking.getTransactionId());
		bookingdto.setMovieId(booking.getMovieId());
		bookingdto.setTotalCost(booking.getTotalCost());
		return bookingdto;
	}

}
