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
@Table(name = "dosen")
public class Dosen {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	@Column(name = "username")
	private String 	username;
	@Column(name = "password")
	private String 	password;
	@Column(name = "nama_dosen")
	private String 	namaDosen;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "plot_mata_kuliah", 
	        joinColumns = { @JoinColumn(name = "dosen_id", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")})
//	private List<Dosen> lstDosen = new ArrayList<Dosen>();
	private List<PlotMataKuliah> lstPlotMataKuliah;
	/*
	@ManyToMany(mappedBy = "lstDosen")
//	List<PlotMataKuliah> lstPlotMataKuliah = new ArrayList<PlotMataKuliah>();
	List<PlotMataKuliah> lstPlotMataKuliah;
	*/
	
}
