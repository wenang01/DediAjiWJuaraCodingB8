package com.examjparelations.main.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "mata_kuliah")
public class MataKuliah {

	@Id
//	@Column(name = "mata_kuliah_id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	@Column(name = "nama_matkul")
	private String 	namaMataKuliah;

	@ManyToMany(mappedBy = "lstMataKuliah")
	private List<PlotMataKuliah> lstPlotMataKuliah;
	
	/*
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "plot_mata_kuliah", 
	        joinColumns = { @JoinColumn(name = "matkul_id", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")})
	private List<PlotMataKuliah> lstPlotMataKuliah;
	*/

}
