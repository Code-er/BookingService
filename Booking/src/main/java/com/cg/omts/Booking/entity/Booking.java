package com.cg.omts.Booking.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_booking")
public class Booking {
	
	@Id
	@Column(name = "booking_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	@Column(name="user_name")
	private String userName;

	@Column(name = "movie_id")
	private int movieId;

	@Column(name = "show_id")
	int showId;

	@Column(name = "no_of_seats")
	private int noOfSeats;

	@Column(name = "booking_date")
	LocalDate bookingDate;

	@Column(name = "transaction_id")
	int transactionId;

	@Column(name = "total_cost")
	double totalCost;

	public Booking() {
		super();
	}

	public Booking(String userName,int movieId, int showId, int noOfSeats, double totalCost) {
		super();
		this.userName=userName;
		this.movieId = movieId;
		this.showId = showId;
		this.noOfSeats = noOfSeats;
		this.totalCost = totalCost;
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

}
