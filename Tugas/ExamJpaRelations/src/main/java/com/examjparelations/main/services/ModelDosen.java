package com.examjparelations.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examjparelations.main.entity.Dosen;
import com.examjparelations.main.repositories.DosenRepository;

@Service
public class ModelDosen implements ModelDosenInterface{

	@Autowired
	DosenRepository dosenRepository;
	
	@Override
	public List<Dosen> getAllDosen(){
		return (List<Dosen>) this.dosenRepository.findAll();
	}

	@Override
	public Dosen getDosenByName(String name) {
		// TODO Auto-generated method stub
		return dosenRepository.findByNamaDosen(name);
	}
	
	
}
