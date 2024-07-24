package com.example.project.pract.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.pract.entity.StudentEntity;
import com.example.project.pract.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studservice;
	
	@PostMapping("/create")
	public String create(@RequestBody StudentEntity stud) {
		return studservice.createstd(stud);
	}
	
	@GetMapping("/listall")
	public List<StudentEntity> getAll(){
		return studservice.getAlls();
	}
	
	@GetMapping("/findbyid")
	public StudentEntity getBYId(@RequestParam int id) {
		return studservice.getStudentsById(id);
	}
	
	@PostMapping("/update")
	public String update(@RequestBody StudentEntity stud) {
		return studservice.updateStd(stud);
	}
	
}
