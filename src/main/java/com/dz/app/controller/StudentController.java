package com.dz.app.controller;

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

import com.dz.app.model.Student;
import com.dz.app.repository.StudentRepository;

@RestController
@RequestMapping("student")
public class StudentController {

	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping
	public ResponseEntity<?> addStudent(@RequestBody Student student){

		Student save = studentRepository.save(student);
		return ResponseEntity.ok(save);
	}
	
	@PutMapping
	public ResponseEntity<?> upateStudent(@RequestBody Student student){

		Student save = studentRepository.save(student);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping
	public ResponseEntity<?> getAllStudents(){
		return ResponseEntity.ok(studentRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable("id") String id){

		Optional<Student> save = studentRepository.findById(id);
		return ResponseEntity.ok(save.get());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") String id){

		studentRepository.deleteById(id);
		return ResponseEntity.ok("success");
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteAllStudent(){

		studentRepository.deleteAll();
		return ResponseEntity.ok("success");
	}
	
}
