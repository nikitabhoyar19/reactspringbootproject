package com.excode.studentsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	

@RequestMapping("/")
 public String hello() {
	return "hello nikita";
}

@RequestMapping("/nik")
 public String hello2() {
	return "hello 2";
	
}

}
