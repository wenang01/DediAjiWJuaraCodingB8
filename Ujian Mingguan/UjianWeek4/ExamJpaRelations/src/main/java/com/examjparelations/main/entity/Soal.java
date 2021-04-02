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
@Table(name = "soal")
public class Soal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	private String	nama_soal;
	private String	status;
	private long	plot_id;
	
	@ManyToMany(mappedBy = "lstSoal")
	private List<Pertanyaan> lstPertanyaan;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "soal", 
	        joinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "plot_id", referencedColumnName = "id")})
	private List<PlotMataKuliah> lstPlotMataKuliah;
	
}
