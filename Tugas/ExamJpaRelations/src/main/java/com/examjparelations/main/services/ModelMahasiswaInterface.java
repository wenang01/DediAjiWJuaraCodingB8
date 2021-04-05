package com.examjparelations.main.services;

import java.util.List;

import com.examjparelations.main.entity.Mahasiswa;

public interface ModelMahasiswaInterface {

	public List<Mahasiswa> getAllMahasiswa();
	public Mahasiswa getMahasiswaByName(String name);
	
}
