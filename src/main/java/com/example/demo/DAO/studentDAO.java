package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Entity.student;

@RepositoryRestResource(collectionResourceRel ="",path="student") 
public interface studentDAO extends JpaRepository<student, Integer>{
	
	List<student> findTop3BySname(String s);
	
}
