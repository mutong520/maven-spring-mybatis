package com.cigna.hra.common.exception;

public enum ExceptionCodeStatusEnum {

	// -------system status
	SUCCESS_STATUS(0), FAILED_STATUS(-1),

	// -------system error
	ILLEGAL_ARGUMENT(-2), JOSN_EXCEPTION(-3), FILTER_EXCEPTION(-4), JSON_TO_MAP_EXCEPTION(-5), SESSION_EXCEPTION(-6),
	// --------------user error
	USER_NOT_FOUND_EXCEPTION(-100), LIKE_MYSELF_EXCEPTION(-101), LIKE_RECODE_NOT_FOUND_EXCEPTION(
			-102), VERIFY_CODE_EXCEPTION(-103), STR_LENGTH_LIMIT_EXCEPTION(-104);

	// 定义私有变量

	private int nCode;
	// 构造函数，枚举类型只能为私有

	private ExceptionCodeStatusEnum(int _nCode) {

		this.nCode = _nCode;

	}

	@Override

	public String toString() {

		return String.valueOf(this.nCode);

	}

	public Integer toInt() {

		return this.nCode;

	}
}
