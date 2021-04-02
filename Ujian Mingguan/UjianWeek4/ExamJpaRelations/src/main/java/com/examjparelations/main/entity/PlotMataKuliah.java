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
import javax.persistence.Query;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "plot_mata_kuliah")
public class PlotMataKuliah {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	private long	matkul_id;	
	private long	nim;	
	private long	dosen_id;

	/*
	@ManyToMany(mappedBy = "lstPlotMataKuliah")
	private List<MataKuliah> lstMataKuliah;
	
	@ManyToMany(mappedBy = "lstPlotMataKuliah")
	private List<Mahasiswa> lstMahasiswa;
	
	@ManyToMany(mappedBy = "lstPlotMataKuliah")
	private List<Dosen> lstDosen;
	*/
	@ManyToMany(mappedBy = "lstPlotMataKuliah")
	private List<Soal> lstSoal;

	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "plot_mata_kuliah", 
	        joinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "nim", referencedColumnName = "id")})
	private List<MataKuliah> lstMataKuliah;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "plot_mata_kuliah", 
	        joinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "nim", referencedColumnName = "id")})
	private List<Mahasiswa> lstMahasiswa;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "plot_mata_kuliah", 
	        joinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "dosen_id", referencedColumnName = "id")})
	private List<Dosen> lstDosen;
	
	/*
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "soal", 
	        joinColumns = { @JoinColumn(name = "soal_id", referencedColumnName = "soal_id")},
	        inverseJoinColumns = { @JoinColumn(name = "matkul_id", referencedColumnName = "id")})
	private List<Soal> lstSoal;
	*/
}
