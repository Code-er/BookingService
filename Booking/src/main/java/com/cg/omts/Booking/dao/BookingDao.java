package com.cg.omts.Booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.omts.Booking.dto.TicketDTO;
import com.cg.omts.Booking.entity.Booking;
import com.cg.omts.Booking.entity.Seats;



public interface BookingDao extends JpaRepository<Booking, Integer> {

	@Query("select b.ticket from Booking b where b.bookingId=?1")
	TicketDTO getTicketByBookingId(int bookingId);

	@Query("select b.ticket from Booking b where b.bookingId=?1")
	void getBookingBySeatId(Seats seat);

}
