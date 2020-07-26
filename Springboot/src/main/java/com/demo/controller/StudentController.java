package com.demo.controller;

import java.util.List;

import com.demo.dao.StudentDao;
import com.demo.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentDao dao;

	@PostMapping("/register")
	public String registerstudent(@RequestBody List<student> obj) {
		dao.save(obj);
		return "Successfull : " + obj.size();
	}

	@GetMapping("/display")
	public List<student> getStudents() {
		
		return (List<student>) dao.findAll();


	}

}
