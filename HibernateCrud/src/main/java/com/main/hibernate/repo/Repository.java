package com.main.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.hibernate.entities.*;

public interface Repository extends JpaRepository<Student, Long>{

}
