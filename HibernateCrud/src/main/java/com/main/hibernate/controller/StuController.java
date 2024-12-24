package com.main.hibernate.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.main.hibernate.entities.Student;
import com.main.hibernate.service.Service;

@RestController
@RequestMapping("/student")
public class StuController {

	@Autowired
	private Service stuService;

	// -------------------- INSERT --------------------------------
	@PostMapping("/post")
	public void addStudent(@RequestBody Student student) {
		stuService.addStudent(student);
	}

	// -------------------- DELETE ---------------------------------
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable Long id) {
		stuService.deleteStudent(id);
	}

	// -------------------- GET BY ID ------------------------------
	@GetMapping("/get/{id}")
	public Optional<Student> getStudentById(@PathVariable Long id) {
		Optional<Student> student = stuService.getByIdStudent(id);
		return student;
	}

   //-------------------- UPDATE ------------------------------
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
		Optional<Student> studentOptional = stuService.getByIdStudent(id);

		if (studentOptional.isPresent()) {
			Student existingStudent = studentOptional.get();
			existingStudent.setName(studentDetails.getName());
			existingStudent.setEmail(studentDetails.getEmail());
			existingStudent.setPassword(studentDetails.getPassword());
			existingStudent.setCourse(studentDetails.getCourse());
			existingStudent.setCity(studentDetails.getCity());

			stuService.addStudent(existingStudent);
			return ResponseEntity.ok(existingStudent);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}