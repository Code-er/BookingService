package com.cg.omts.Booking.dto;

public class ErrorDTO {
	private String type;
	private String message;

	public ErrorDTO() {
		super();
	}

	public ErrorDTO(String type, String message) {
		super();
		this.type = type;
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
