package sqch10ex6.service;

import org.springframework.stereotype.Service;

import sqch10ex6.dto.PaymentDetails;
import sqch10ex6.exception.NotEnoughMoneyException;

@Service
public class PaymentService {
	public PaymentDetails processPayment() throws NotEnoughMoneyException{
		var e = new NotEnoughMoneyException();
		e.setMessage("계좌에 잔고가 부족합니다.");
		throw e;
	}
}
