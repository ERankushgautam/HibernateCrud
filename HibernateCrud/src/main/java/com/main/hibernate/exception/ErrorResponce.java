package com.main.hibernate.exception;

import lombok.Data;

@Data
public class ErrorResponce {

	private Integer errorCode;
	private String errorMsg;

	public ErrorResponce(Integer errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

}
