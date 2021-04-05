package com.examjparelations.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examjparelations.main.entity.Mahasiswa;
import com.examjparelations.main.repositories.MahasiswaRepository;

@Service
public class ModelMahasiswa implements ModelMahasiswaInterface{

	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		//return this.mahasiswaRepository.findAll();
		return (List<Mahasiswa>) this.mahasiswaRepository.findAll();
		
	}

	@Override
	public Mahasiswa getMahasiswaByName(String name) {
		
		return mahasiswaRepository.findByNamaMahasiswa(name);
		
	}

}
