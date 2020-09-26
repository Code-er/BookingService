package com.cg.omts.Booking.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="movie_booking")
public class Booking {
	
	@Id
	@Column(name="booking_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bookingId;
	
	
	@Column(name="movie_Id")
	int movieId;
	

	@ManyToOne
	Show showRef;
	
	@Column(name="booking_date",nullable=false)
	LocalDate bookingDate;
	
	@Column(name="transactional_id")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transactional_seq")
	//@SequenceGenerator(sequenceName = "transactional_seq", initialValue = 040101 , allocationSize = 1, name = "transactional_seq")
	int transactionId;
	
	@Column(name="total_cost",nullable=false)
	double totalCost;
	
	@Column(name="seat_List")
	List<Seats> seatList;
	
	
	public Booking(int movieId, Show showRef, LocalDate bookingDate, double totalCost, List<Seats> seatList) {
		super();
		this.movieId = movieId;
		this.showRef = showRef;
		this.bookingDate = bookingDate;
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


	public List<Seats> getSeatList() {
		return seatList;
	}


	public void setSeatList(List<Seats> seatList) {
		this.seatList = seatList;
	}
	}

