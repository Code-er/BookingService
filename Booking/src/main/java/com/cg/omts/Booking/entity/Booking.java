package com.cg.omts.Booking.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="movie_booking")
public class Booking {
	
	@Id
	@Column(name="booking_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	
	@Column(name="movie_id")
	private int movieId;
	
    @Column(name="show_id")
	int showId;
	
	@Column(name="booking_date",nullable=false)
	LocalDate bookingDate;
	
	


	@Column(name="transaction_id")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transactional_seq")
	//@SequenceGenerator(sequenceName = "transactional_seq", initialValue = 040101 , allocationSize = 1, name = "transactional_seq")
	int transactionId;
	
	@Column(name="total_cost",nullable=false)
	double totalCost;
	
	public Booking() {
		super();
	}


	//@OneToMany(targetEntity=Seats.class)
//	@Column(name="seat_List")
	@ElementCollection
	List<Integer> seatList;
	
	
	public Booking(int movieId, int showId, LocalDate bookingDate,int  transactionId, double totalCost,List<Integer> seatList) {
		super();
		this.movieId = movieId;
		this.showId = showId;
		this.bookingDate =bookingDate;
		this.transactionId=transactionId;
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
	

@Override
public String toString() {
	return "Booking [bookingId=" + bookingId + ", movieId=" + movieId + ", showId=" + showId + ", bookingDate="
			+ bookingDate + ", transactionId=" + transactionId + ", totalCost=" + totalCost + ", seatList="
			+ seatList + "]";
}
}

