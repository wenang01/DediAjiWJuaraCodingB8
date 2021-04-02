package com.jpa.relations.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.jpa.relations.entity.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="courses")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private Double fee;
	private int module;
	private String abbreviation;
	 
	@ManyToMany(mappedBy = "lstCourse")
	private List<Student> lstStudent = new ArrayList<Student>();
	
}
