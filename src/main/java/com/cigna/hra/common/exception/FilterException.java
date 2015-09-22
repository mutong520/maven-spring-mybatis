package com.cigna.hra.common.exception;

import com.cigna.hra.common.exception.BaseAPIException;
import com.cigna.hra.common.exception.ExceptionCodeStatusEnum;

/**
 * 过滤层异常
 * 
 * @author edwin.zhou
 *
 */
public class FilterException extends BaseAPIException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3796340342119449661L;

	private int errorCode = ExceptionCodeStatusEnum.FILTER_EXCEPTION.toInt();

	@Override
	public int getErrorCode() {
		return errorCode;
	}

	public FilterException(String message) {
		super(message);
	}

	public FilterException(String message, int errorCode) {
		super(message);
	}

}
