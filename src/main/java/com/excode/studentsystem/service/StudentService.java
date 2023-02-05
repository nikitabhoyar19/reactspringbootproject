package com.excode.studentsystem.service;

import java.util.List;

import com.excode.studentsystem.model.Student;

public interface StudentService {
	
   public Student saveStudent(Student student);
   
   public List<Student> getAllStudent();
   
   public Student getDataById(Integer id);

   public void update(Student student, Integer id);

}
