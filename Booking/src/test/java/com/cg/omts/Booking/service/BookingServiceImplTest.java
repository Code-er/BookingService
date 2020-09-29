package com.cg.omts.Booking.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.omts.Booking.entity.Booking;

@SpringBootTest
class BookingServiceImplTest {
	
	@Autowired
	BookingService bookingservice;
	
	Booking booking=new Booking(321,546,LocalDate.of(2020, 4, 5),20156,560.0,Arrays.asList(11,12,15));
	Booking booking1=new Booking(32,546,LocalDate.of(2020, 4, 5),20156,560.0,Arrays.asList(11,12,15));
	@Test
	void testAddBooking() {
		assertThat(bookingservice.addBooking(booking)).isEqualTo(booking1);
	}
	
	
	@Test
	void testMakePayment()  //Perfect Scenario for caed credentials
	{
		assertThat(bookingservice.makePayment("12345678911123", "548", LocalDate.of(2021, 4, 10))).isNotEqualTo(0);
	}
	
	@Test
	void testMakePayment1()  //incorrect card number
	{
		assertThat(bookingservice.makePayment("1234567891112345", "548", LocalDate.of(2021, 4, 10))).isNotEqualTo(0);
	}
	
	@Test
	void testMakePayment2()  //incorrect cvv
	{
		assertThat(bookingservice.makePayment("1234567891112345", "58", LocalDate.of(2021, 4, 10))).isNotEqualTo(0);
	}
	
	@Test
	void testMakePayment3()  //incorrect expiry date
	{
		assertThat(bookingservice.makePayment("1234567891112345", "58", LocalDate.of(2013, 4, 10))).isNotEqualTo(0);
	}
	
	

}
