package com.juaracoding.jparepository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.jparepository.entity.Product;
import com.juaracoding.jparepository.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProduct(@RequestBody List<Product> products) {
		return productService.saveProducts(products);
	}
	
	@GetMapping("/getProducts")
	public List<Product> findAllProducts(){
		return productService.getProducts();
	}
	
	@GetMapping("/getProduct/{id}")
	public Product findProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/getProductByName/{name}")
	public Product findProductByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}
	
	@GetMapping("/getProductByQuantity/{quantity}")
	public Product findProductByQuantity(@PathVariable int quantity) {
		return productService.getProductByQuantity(quantity);
	}
	
	@GetMapping("/maxPrice")
	public List<Product> findMaxPrice(){
		return productService.getMaxPrice();
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduct(id);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
}
