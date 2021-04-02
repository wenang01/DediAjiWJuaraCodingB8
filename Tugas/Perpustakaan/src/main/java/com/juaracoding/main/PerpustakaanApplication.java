package com.juaracoding.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juaracoding.main.entity.Book;
import com.juaracoding.main.entity.Pages;
import com.juaracoding.main.repository.BookRepository;
import com.juaracoding.main.repository.PagesRepository;

@SpringBootApplication
public class PerpustakaanApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PerpustakaanApplication.class, args);
	}
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	PagesRepository pagesRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Book book = new Book();
		book.setAuthor("Dedi");
		book.setIsbn("abcde");
		book.setTitle("beranak dalam kardus");
		
		Pages page = new Pages();
		page.setNumber(100);
		page.setChapter("Chapter 1");
		page.setContent("Hooror");
		
		Pages page2 = new Pages();
		page2.setNumber(200);
		page2.setChapter("Chapter 2");
		page2.setContent("Komedi");
		
		List <Pages> lstPages = new ArrayList<Pages>();
		lstPages.add(page);
		lstPages.add(page2);
		
		book.setPages(lstPages);
		
		this.bookRepository.save(book);
		
	}

}
