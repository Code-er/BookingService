package com.cg.omts.Booking.dto;

import java.time.LocalDate;

import com.cg.omts.Booking.entity.Seats;
import com.cg.omts.Booking.entity.Show;

public class BookingDTO {
	
int bookingId;
int movieId;
int showId;
Show showRef;
LocalDate bookingDate;
int transactionId;
double totalCost;
Seats seatList;
public BookingDTO(int bookingId, int movieId, int showId, Show showRef, LocalDate bookingDate, int transactionId,
		double totalCost, Seats seatList) {
	super();
	this.bookingId = bookingId;
	this.movieId = movieId;
	this.showId = showId;
	this.showRef = showRef;
	this.bookingDate = bookingDate;
	this.transactionId = transactionId;
	this.totalCost = totalCost;
	this.seatList = seatList;
}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public Show getShowRef() {
	return showRef;
}
public void setShowRef(Show showRef) {
	this.showRef = showRef;
}
public LocalDate getBookingDate() {
	return bookingDate;
}
public void setBookingDate(LocalDate bookingDate) {
	this.bookingDate = bookingDate;
}
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
public Seats getSeatList() {
	return seatList;
}
public void setSeatList(Seats seatList) {
	this.seatList = seatList;
}




}
