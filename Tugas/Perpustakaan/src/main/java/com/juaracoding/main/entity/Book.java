package com.juaracoding.main.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long 	id;
	
	@Column(name =	"isbn")
	private String 	isbn;
	
	@Column(name =	"author")
	private String	author;
	
	@Column(name =	"title")
	private String	title;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id", referencedColumnName = "id")
	private List<Pages> pages = new ArrayList<Pages>();

}
