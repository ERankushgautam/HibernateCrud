package com.main.hibernate.exception;

import lombok.Getter;

@Getter
public class UserExistException extends RuntimeException {
	 
	private static final long serialVersionUID = 1L;

	String errorCode ;
	String errorMsg ;
}
