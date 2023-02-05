package com.excode.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excode.studentsystem.model.Student;
import com.excode.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return student.getName() + " -> new student is added";
	}
	
	@GetMapping("/all")
	public List<Student> get(){
		return studentService.getAllStudent();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable("id") Integer id) {
		return studentService.getDataById(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@PathVariable("id") Integer id, @RequestBody Student student) {
		Student st = studentService.getDataById(id);
		st.setName(student.getName());
		st.setAddress(student.getAddress());
		Student id1 = studentService.saveStudent(student);
		return new ResponseEntity<String>("Student with '"+id+"' has been updated",HttpStatus.OK);
	}
	
	
}
