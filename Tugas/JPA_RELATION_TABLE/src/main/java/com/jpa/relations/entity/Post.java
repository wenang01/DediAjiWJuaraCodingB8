package com.jpa.relations.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long 	id;
	
	private String 	description;
	private String 	title;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_fid", referencedColumnName = "id")
	List <Comment> lstComment = new ArrayList<Comment>();
}
