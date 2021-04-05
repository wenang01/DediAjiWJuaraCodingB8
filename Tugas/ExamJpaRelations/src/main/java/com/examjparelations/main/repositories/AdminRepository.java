package com.examjparelations.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examjparelations.main.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
