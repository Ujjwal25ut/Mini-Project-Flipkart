package com.flipkart.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

	List<Product> findByPname(String pname);
	
}
