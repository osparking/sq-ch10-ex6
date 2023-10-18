package sqch10ex6.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import sqch10ex6.dto.ErrorDetails;
import sqch10ex6.exception.NotEnoughMoneyException;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	@ExceptionHandler(NotEnoughMoneyException.class)
	public ResponseEntity<ErrorDetails> notEnoughMoneyExcepHandler(
			NotEnoughMoneyException e) {
		var details = new ErrorDetails();
		details.setMessage(e.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(details);
	}

}
