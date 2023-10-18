package sqch10ex6.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sqch10ex6.dto.PaymentDetails;
import sqch10ex6.exception.NotEnoughMoneyException;
import sqch10ex6.service.PaymentService;

@RestController
@AllArgsConstructor
public class PaymentController {
	private final PaymentService service;
	
	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> processPayment() throws NotEnoughMoneyException {
		
		var details = service.processPayment();
		return ResponseEntity.status(HttpStatus.ACCEPTED)
				.body(details);
				
	}

}
