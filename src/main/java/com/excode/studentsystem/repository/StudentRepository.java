package com.excode.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excode.studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
