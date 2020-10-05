package com.cg.omts.Booking.dto;

import java.time.LocalDate;

public class CardDetailsDTO {

	private String cardNumber;
	private String cvv;
	private LocalDate expiryDate;

	public CardDetailsDTO() {
		super();
	}

	public CardDetailsDTO(String cardNumber, String cvv, LocalDate expiryDate) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

}
