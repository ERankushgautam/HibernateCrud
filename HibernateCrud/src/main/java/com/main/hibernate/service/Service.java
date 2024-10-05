package com.main.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.hibernate.entities.Student;
import com.main.hibernate.repo.Repository;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface {

	@Autowired
	private Repository stuRepository;

	@Override
	public Boolean addStudent(Student student) {
		Boolean status = false;
		try {
			stuRepository.save(student);
			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}

		return status;

	}

	@Override
	public List<Student> getAllStudent() {

		List<Student> students = null;
		try {
			students = stuRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;

	}

	@Override
	public Boolean deleteStudent(Long id) {
		Boolean status = false;
		try {
			stuRepository.deleteById(id);
			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Optional<Student> getByIdStudent(Long id) {
		Optional<Student> student = null;
		try {
			student = stuRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public boolean updateStudent(Long id, Student student) {
		try {
			Optional<Student> existingStudent = stuRepository.findById(id);

			if (existingStudent.isPresent()) {
				Student updatedStudent = existingStudent.get();

				updatedStudent.setName(student.getName());

				updatedStudent.setEmail(student.getEmail());
				updatedStudent.setCourse(student.getCourse());

				stuRepository.save(updatedStudent);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
