package com.example.dockerspringtask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockerspringtask.entity.Student;
import com.example.dockerspringtask.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/{studentName}")
	public List<Student>addNewStudent(@PathVariable String studentName){
		Student student = new Student();
		student.setGrade("10th");
		student.setName(studentName);
		studentRepository.save(student);
		return studentRepository.findAll();
	}
}
