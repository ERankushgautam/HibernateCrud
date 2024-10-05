package com.main.hibernate.Dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentRequest implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String name;

	private String email;

	private String password;

	private String course;

	private String city;

}
