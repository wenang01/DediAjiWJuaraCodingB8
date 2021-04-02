package com.juaracoding.jparepository.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juaracoding.jparepository.entity.Product;
import com.juaracoding.jparepository.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products){
		return productRepository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "Product di delete";
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct= productRepository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return productRepository.save(existingProduct);
	}
	
	public Product getProductByQuantity(int quantity) {
		return productRepository.findyByQuantity(quantity);
	}
	
	public List<Product> getMaxPrice(){
		return productRepository.findMax();
	}
}
