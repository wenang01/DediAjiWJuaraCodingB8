package com.juaracoding.jparepository.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.juaracoding.jparepository.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);
	
	@Query(value="Select *from Product where quantity = ?1", nativeQuery = true)
	Product findyByQuantity(int quantity);
	
	@Query(value = "Select *from Product Order By price desc limit 4", nativeQuery = true)
	public List<Product> findMax();
	
}
