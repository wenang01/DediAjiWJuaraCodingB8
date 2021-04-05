package com.examjparelations.main.services;

import java.util.List;

import com.examjparelations.main.entity.Dosen;

public interface ModelDosenInterface {

	List<Dosen> getAllDosen();
	public Dosen getDosenByName(String name);

}
