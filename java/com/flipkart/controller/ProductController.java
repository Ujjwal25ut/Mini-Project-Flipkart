package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.entity.Product;
import com.flipkart.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping(value = "/addproduct")
	Product createProduct(@RequestBody Product product) {
		Product p= productService.createProduct(product);
		return p;
	}
	
	@DeleteMapping(value = "/deleteproduct")
	void deleteAllProduct( ) {
		productService.deleteAllProduct();
	}
	
	@PutMapping(value = "/updateproduct/{p_id}")
	Product updateWithIdProduct(@RequestBody Product product, @PathVariable long p_id) {
		Product p= productService.updateWithIdProduct(product , p_id);
		return p;
	}
	
	@DeleteMapping(value = "/deleteproduct/{p_id}")
	void deleteByIdProduct(@PathVariable long p_id) {
		productService.deleteByIdProduct(p_id);
	
	}
	
	@GetMapping(value = "/getproduct")
	List<Product> getAllDepartment(){
	List<Product> p = productService.getAllProduct();
	return p;
		
	}
	
	@GetMapping(value = "/getproduct/{p_id}")
	Product getByIdProduct( @PathVariable long p_id) {
	Product p = productService.getByIdProduct( p_id);
	return p;
		
	}
	
	@GetMapping(value = "/searchproduct/{pname}")
	public List<Product> searchByNameProduct(@PathVariable String pname){
		List<Product> p = productService.searchProduct(pname);
		return p;
	}
}
