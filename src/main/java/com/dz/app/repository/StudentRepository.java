package com.dz.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dz.app.model.Student;

public interface StudentRepository extends MongoRepository<Student,String> {

	
}
