package com.main.hibernate.Dto;

import lombok.Data;

@Data
public class StudentResponse {

	private Long id;

	private String name;

	private String email;

	private String password;

	private String course;

	private String city;
}
