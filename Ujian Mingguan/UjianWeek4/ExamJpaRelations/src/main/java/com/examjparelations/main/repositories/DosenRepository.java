package com.examjparelations.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.examjparelations.main.entity.Dosen;
import com.examjparelations.main.entity.Mahasiswa;

//public interface DosenRepository extends JpaRepository<Dosen, Long>{
//
//}

public interface DosenRepository extends CrudRepository<Dosen, Long>{

	public Dosen findByNamaDosen(String nama);
	
}
