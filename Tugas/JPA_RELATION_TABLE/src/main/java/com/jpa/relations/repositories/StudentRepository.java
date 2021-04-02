package com.jpa.relations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relations.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	public Student findByName(String name);
	
}
