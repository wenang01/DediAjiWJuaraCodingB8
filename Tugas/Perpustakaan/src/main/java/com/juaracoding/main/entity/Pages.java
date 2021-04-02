package com.juaracoding.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Pages")
public class Pages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String 	chapter; 
	private String 	content; 
	private int 	number;
			
}
