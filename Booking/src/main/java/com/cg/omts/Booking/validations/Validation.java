package com.cg.omts.Booking.validations;

import java.time.LocalDate;

public class Validation {
	
	public boolean isValidCardNumber(String cardNumber)
	{
		return cardNumber.matches("\\d{16}");
	}

	public boolean isValidCvv(String cvv)
	{
		return cvv.matches("\\d{3}");
	}

	public boolean isValidExpiryDate(LocalDate expiry)
	{
		return expiry.compareTo(LocalDate.now()) > 0;
	}

	
	
}
