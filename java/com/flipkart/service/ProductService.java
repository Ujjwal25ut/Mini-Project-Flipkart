package com.flipkart.service;

import java.util.List;

import com.flipkart.entity.Product;

public interface ProductService {
//	ADD
//	DELETE ALL
//	UPDATE WITHID
//	DELETE BYID
//	GET ALL
//	GET BY ID
//	Search by name
	
	Product createProduct(Product product);
	void deleteAllProduct();
	Product updateWithIdProduct(Product product, long p_id);
	void deleteByIdProduct(long p_id);
	List<Product> getAllProduct();
	Product getByIdProduct(long p_id);
	List<Product> searchProduct(String pname);

}
