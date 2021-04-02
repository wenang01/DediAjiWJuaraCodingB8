package com.jpa.relations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relations.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long>{

}
