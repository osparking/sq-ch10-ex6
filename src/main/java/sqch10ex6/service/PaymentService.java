package sqch10ex6.service;

import org.springframework.stereotype.Service;

import sqch10ex6.dto.PaymentDetails;
import sqch10ex6.exception.NotEnoughMoneyException;

@Service
public class PaymentService {
	public PaymentDetails processPayment() throws NotEnoughMoneyException{
		throw new NotEnoughMoneyException();
	}
}
