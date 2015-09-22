package com.cigna.hra.common.exception;

/**
 * 参数异常
 * 
 */
public class InvalidArgumentException extends RuntimeException {

	private static final long serialVersionUID = 125088018455402885L;

	public InvalidArgumentException() {
		super();
	}

	public InvalidArgumentException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidArgumentException(String message) {
		super(message);
	}

	public InvalidArgumentException(Throwable cause) {
		super(cause);
	}
}
