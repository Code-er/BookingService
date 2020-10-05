package com.cg.omts.Booking.service;

import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.omts.Booking.entity.Booking;

@SpringBootTest
class BookingServiceImplTest {

	@Autowired
	BookingService bookingservice;

	
	  Booking booking = new Booking("RAJSAREE",321, 546, 4,560.0); 
	 
	 

	@Test
	void testAddBooking() {
		assertThat(bookingservice.addBooking(booking)).isEqualTo(booking);
	}

	@Test
	void testMakePayment() // Perfect Scenario for card credentials
	{
		assertThat(bookingservice.makePayment("12345678911123", "548", LocalDate.of(2021, 4, 10))).isNotZero();
	}

	@Test
	void testMakePayment1() // incorrect card number
	{
		assertThat(bookingservice.makePayment("1234567891112345", "548", LocalDate.of(2021, 4, 10))).isNotZero();
	}

	@Test
	void testMakePayment2() // incorrect cvv
	{
		assertThat(bookingservice.makePayment("1234567891112345", "58", LocalDate.of(2021, 4, 10))).isNotZero();
	}

	@Test
	void testMakePayment3() // incorrect expiry date
	{
		assertThat(bookingservice.makePayment("1234567891112345", "58", LocalDate.of(2013, 4, 10))).isNotZero();
	}

}
