package com.cg.omts.Booking.controller;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.omts.Booking.dto.ErrorDTO;
import com.cg.omts.Booking.exceptions.CustomException;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler({CustomException.class,SQLException.class,NullPointerException.class})
	public ResponseEntity<ErrorDTO> exception(CustomException exception){
		ErrorDTO error = new ErrorDTO("error",exception.getMessage());
		ResponseEntity<ErrorDTO> response = new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		return response;
	}

}
