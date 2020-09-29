package com.cg.omts.Booking.dto;

import java.time.LocalDate;

import com.cg.omts.Booking.entity.Booking;

import java.util.*;

public class BookingDTO {
	
private int bookingId;
private int movieId;
private int showId;
private LocalDate bookingDate;
private int transactionId;
private double totalCost;
private List<Integer> seatList;
private List<Integer> showList;

public BookingDTO(int bookingId, int movieId, int showId, List<Integer> showList, LocalDate bookingDate, int transactionId,
		double totalCost, List<Integer> seatList) {
	super();
	this.bookingId = bookingId;
	this.movieId = movieId;
	this.showList = showList;
	this.bookingDate = bookingDate;
	this.transactionId = transactionId;
	this.totalCost = totalCost;
	this.seatList = seatList;
	this.showId=showId;
}


public BookingDTO() {
	super();
}
/*
 * public BookingDTO(Booking booking) { super();
 * this.bookingId=booking.getBookingId(); this.movieId=booking.getMovieId();
 * this.bookingDate = booking.getBookingDate(); this.showRef
 * =booking.getShowRef(); this.transactionId = booking.getTransactionId();
 * this.totalCost =booking.getTotalCost(); //this.seatList=new
 * LinkedList(booking.getSeatList().split(","));
 * //this.seatList=Arrays.asList(booking.getSeatList().split(",")); }
 */




@Override
public String toString() {
	return "BookingDTO [bookingId=" + bookingId + ", movieId=" + movieId + ", showId=" + showId + ", bookingDate="
			+ bookingDate + ", transactionId=" + transactionId + ", totalCost=" + totalCost + ", seatList=" + seatList
			+ ", showList=" + showList + "]";
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
public List<Integer> getSeatList() {
	return seatList;
}
public void setSeatList(List<Integer> seatList) {
	this.seatList = seatList;
}




}
