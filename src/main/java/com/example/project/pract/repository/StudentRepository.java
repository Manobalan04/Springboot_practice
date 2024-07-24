package com.example.project.pract.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.pract.entity.StudentEntity;



@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
