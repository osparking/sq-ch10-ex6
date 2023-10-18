package sqch10ex6.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sqch10ex6.exception.NotEnoughMoneyException;
import sqch10ex6.service.TransferService;

@RestController
@AllArgsConstructor
public class TransferController {
	private final TransferService service;
	@PostMapping("/transfer")
	public String transfer() throws NotEnoughMoneyException {
		;
		return service.processTransfer();
	}
	
}
