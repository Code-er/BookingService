package com.cg.omts.Booking.dto;

import java.time.LocalDate;

public class BookingDTO {

	private String userName;
	private int bookingId;
	private int movieId;
	private int showId;
	private LocalDate bookingDate;
	private int transactionId;
	private double totalCost;
	private int noOfSeats;

	

	public BookingDTO() {
		super();
	}
	public BookingDTO(String userName,int bookingId, int movieId, int showId, LocalDate bookingDate, int transactionId,
			double totalCost, int noOfSeats) {
		super();
		this.userName=userName;
		this.bookingId = bookingId;
		this.movieId = movieId;
		this.showId = showId;
		this.bookingDate = bookingDate;
		this.transactionId = transactionId;
		this.totalCost = totalCost;
		this.noOfSeats = noOfSeats;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	@Override
	public String toString() {
		return "BookingDTO [userName=" + userName + ", bookingId=" + bookingId + ", movieId=" + movieId + ", showId="
				+ showId + ", bookingDate=" + bookingDate + ", transactionId=" + transactionId + ", totalCost="
				+ totalCost + ", noOfSeats=" + noOfSeats + "]";
	}
	

	
	

}
