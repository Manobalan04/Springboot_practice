package com.example.project.pract.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.tool.schema.internal.exec.GenerationTargetToStdout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.pract.entity.StudentEntity;
import com.example.project.pract.repository.StudentRepository;


@Service
public class StudentService {

	@Autowired
	private StudentRepository studRepo;
	
	public String createstd(StudentEntity std) {
		studRepo.save(std);
		return "created";
	}
	
	public List<StudentEntity> getAlls(){
		return studRepo.findAll();
	}
	
//	public StudentEntity getStudentById(int id) {
//		return studRepo.findById(id).get();
//	}
	
	public StudentEntity getStudentsById(int id) {
		Optional<StudentEntity> getstud=studRepo.findById(id);
		
		if (getstud.isPresent()){
			return studRepo.findById(id).get();
		}else
			return null;
	}
	
	public String updateStd(StudentEntity std) {
		Optional<StudentEntity> getstd=studRepo.findById(std.getId());
		
		if(getstd.isPresent()) {
			StudentEntity newstd=getstd.get();
			
			if(!newstd.getName().isBlank())
			newstd.setName(std.getName());
			
			if(!newstd.getName().isBlank())
			newstd.setCourse(std.getCourse());
			
			studRepo.save(newstd);
			
		}else {
		return "not found";
		}
		return"updated";
	}
	
}
