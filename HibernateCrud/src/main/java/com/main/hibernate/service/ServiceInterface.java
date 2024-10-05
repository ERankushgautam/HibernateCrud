package com.main.hibernate.service;

import java.util.List;
import java.util.Optional;

import com.main.hibernate.entities.Student;

public interface ServiceInterface {
	public Boolean addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Boolean deleteStudent(Long id);
	
	public Optional<Student> getByIdStudent(Long id);
	
	public boolean updateStudent(Long id, Student student);

}