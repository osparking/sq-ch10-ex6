package sqch10ex6.exception;

import lombok.Data;

@Data
public class NotEnoughMoneyException extends Exception {
	private String message;
}
