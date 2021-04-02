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
@Table(name = "mahasiswa")
public class Mahasiswa {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	@Column(name = "nama_mahasiswa")
	private String	namaMahasiswa;
	@Column(name = "jenis_kelamin")
	private String 	jenisKelamin;
	@Column(name = "password")
	private String 	password;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "plot_mata_kuliah", 
	        joinColumns = { @JoinColumn(name = "nim", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")})
//	private List<Mahasiswa> lstMahasiswa = new ArrayList<Mahasiswa>();
	private List<PlotMataKuliah> lstPlotMataKuliah;
	/*
	@ManyToMany(mappedBy = "lstMahasiswa")
//	List<PlotMataKuliah> lstPlotMataKuliah = new ArrayList<PlotMataKuliah>();
	List<PlotMataKuliah> lstPlotMataKuliah;
	*/
	
}
