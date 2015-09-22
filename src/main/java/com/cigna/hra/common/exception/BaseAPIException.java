package com.cigna.hra.common.exception;

import com.cigna.hra.common.exception.ExceptionCodeStatusEnum;

/**
 * 
 * @author kelvin.tie
 */
public class BaseAPIException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7065579710316348767L;

	private int errorCode = ExceptionCodeStatusEnum.FAILED_STATUS.toInt();

	public int getErrorCode() {
		return errorCode;
	}

	public BaseAPIException() {
		super();
	}

	public BaseAPIException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseAPIException(String message) {
		super(message);
	}

	public BaseAPIException(Throwable cause) {
		super(cause);
	}

}
