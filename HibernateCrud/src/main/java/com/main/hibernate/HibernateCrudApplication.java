package com.main.hibernate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.main.hibernate")
public class HibernateCrudApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(HibernateCrudApplication.class, args);
		System.out.println("started...");
		
		
	}

}
