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
@Table(name = "pertanyaan")
public class Pertanyaan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	private long	soal_id;
	private String	pertanyaan;
	private String	jawaban;
	private String	jawaban2;
	private String	jawaban3;
	private String	jawaban4;
	private String	jawaban_benar;
	private String	status_gambar;
	
	@ManyToMany(mappedBy = "lstPertanyaan")
	private List<Nilai> lstNilai;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "pertanyaan", 
	        joinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "soal_id", referencedColumnName = "id")})
	private List<Soal> lstSoal;
	
}
