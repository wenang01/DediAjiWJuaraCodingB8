package com.examjparelations.main.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
//@ToString(exclude = "lstPlotMataKuliah") // [solution 1] for thymeleaf string view if data on table are not string at all
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
	
	@ManyToMany(mappedBy = "lstMahasiswa")
	@ToString.Exclude // [solution 2] for thymeleaf string view if data on table are not string at all
	private List<PlotMataKuliah> lstPlotMataKuliah;
	
	
	/*
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "plot_mata_kuliah", 
	        joinColumns = { @JoinColumn(name = "nim", referencedColumnName = "id")},
	        inverseJoinColumns = { @JoinColumn(name = "id", referencedColumnName = "id")})
	private List<Mahasiswa> lstMahasiswa = new ArrayList<Mahasiswa>();
	*/


	
}
