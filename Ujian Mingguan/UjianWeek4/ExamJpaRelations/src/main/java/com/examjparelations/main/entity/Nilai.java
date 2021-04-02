package com.examjparelations.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "nilai")
public class Nilai {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	private long	soal_id;
	private int		nilai;
		
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "nilai", 
	        joinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "soal_id", referencedColumnName = "id")})
	private List<Pertanyaan> lstPertanyaan;
	
}
