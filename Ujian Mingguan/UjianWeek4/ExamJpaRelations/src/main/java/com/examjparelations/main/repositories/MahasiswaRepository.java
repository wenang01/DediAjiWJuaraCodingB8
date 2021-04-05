package com.examjparelations.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.examjparelations.main.entity.Mahasiswa;

//public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{
//
//}

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Long>{

	public Mahasiswa findByNamaMahasiswa(String nama);
	
}
