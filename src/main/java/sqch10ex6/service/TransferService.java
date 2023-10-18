package sqch10ex6.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import sqch10ex6.exception.NotEnoughMoneyException;

@Service
public class TransferService {
	public String processTransfer() throws NotEnoughMoneyException {
		var now = LocalDateTime.now();
		System.out.println( now.getHour());
		if (now.getHour() >= 22) {
			var e = new NotEnoughMoneyException();
			e.setMessage("송금 근원 계좌에 잔고가 송금할 액수보다 작습니다");
			throw e;
		} else {
			return "계좌이체 성공";
		}
	}

}
