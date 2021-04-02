package com.jpa.relations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.relations.entity.Comment;
import com.jpa.relations.entity.Courses;
import com.jpa.relations.entity.Instructor;
import com.jpa.relations.entity.InstructorDetail;
import com.jpa.relations.entity.Post;
import com.jpa.relations.entity.Student;
import com.jpa.relations.repositories.CoursesRepository;
import com.jpa.relations.repositories.InstructorRepository;
import com.jpa.relations.repositories.PostReopsitory;
import com.jpa.relations.repositories.StudentRepository;

@SpringBootApplication
public class JpaRelationsTableApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JpaRelationsTableApplication.class, args);
	}

	@Autowired
	InstructorRepository instructorRepository;
	
	@Autowired
	PostReopsitory postRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CoursesRepository coursesRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		/*	Instructor instruktur = new Instructor();
		instruktur.setEmail("dewabrata@gmail.com");
		instruktur.setFirstName("Dewa");
		instruktur.setLastName("Brata");
		
		InstructorDetail detail1 = new InstructorDetail();
		detail1.setHobby("Nyupang");
		detail1.setYoutubeChannel("tokodewacupang");
		
		instruktur.setInstructorDetail(detail1);
		
		this.instructorRepository.save(instruktur);
		
		Post post = new Post();
		post.setTitle("TitTok Keren");
		post.setDescription("Cerita tiktok gw");
		
		Comment comment1 = new Comment();
		comment1.setText("Wuihh keren banget");
		
		Comment comment2 = new Comment();
		comment2.setText("Upload lagi dunk");
		
		
		List<Comment> lstComment = new ArrayList<Comment>();
		lstComment.add(comment1);
		lstComment.add(comment2);
		
		post.setLstComment(lstComment);
		
		this.postRepository.save(post); */
		
		Student student = new Student();
		student.setName("Dewi");
		
		Courses course1 = new Courses();
		course1.setTitle("Belajar Memasak");
		
		Courses course2 = new Courses();
		course2.setTitle("Belajar Youtuber");
		
	    List<Courses>lstCourses = new ArrayList<Courses>();
	    lstCourses.add(course1);
	    lstCourses.add(course2);
		
	//	student.setLstCourse(lstCourses);
	//	this.studentRepository.save(student);
		
		
		List<Student> lstStudent = new ArrayList<Student>();
		lstStudent.add(student);
		
		Courses course3 = new Courses();
		course3.setTitle("Belajar Instagram");
		course3.setModule(2);
		course3.setFee(99000.00);
		course3.setAbbreviation("Ini apa si");
		course3.setLstStudent(lstStudent);
		
		this.coursesRepository.save(course3);

		
		
//		
//		Student lstStudent1 = this.studentRepository.findByName("Dewabrata");
//		
//		lstStudent1.toString();
	}

}
