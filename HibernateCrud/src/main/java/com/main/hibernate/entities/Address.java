package com.main.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Address {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long Id;

	@Column
	private String town;

	@Column
	private String state;

	@Column
	private String country;

	@Column
	private Long pinCode;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Student studentId;

}
