package com.flipkart.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.entity.Product;
import com.flipkart.repo.ProductRepo;
import com.flipkart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
//	ADD
//	DELETE ALL
//	UPDATE WITHID
//	DELETE BYID
//	GET ALL
//	GET BY ID
//	Search by name
	
	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Product createProduct(Product product) {
		Product p = productRepo.save(product);
		return p;
	}

	@Override
	public void deleteAllProduct() {
		productRepo.deleteAll();
		
	}


	@Override
	public Product updateWithIdProduct(Product product, long p_id) {
		Optional<Product> optional = productRepo.findById(p_id); 
		Product p=null;
        
        if(optional.isPresent()) {
            p=optional.get();
            p.setPname(product.getPname());
            p.setId(product.getId());
            p.setPrice(product.getPrice());
            p.setFeature(product.getFeature());
            productRepo.save(p);  
        }
		else {
            throw new RuntimeException("Product not found for id::" + p_id);
        }
		
		return p;
}

	@Override
	public void deleteByIdProduct(long p_id) {
		productRepo.deleteById(p_id);
		
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> p = productRepo.findAll();
		return p;
	}

	@Override
	public Product getByIdProduct(long p_id) {
		Optional<Product> optional=productRepo.findById(p_id);
		Product product=null;
        if(optional.isPresent()) {
            product=optional.get();
        }else {
            throw new RuntimeException("Department not found for id::" + p_id);
        }
        return product;
    }


	

	@Override
	public
	List<Product> searchProduct(String pname) {
		List<Product> p = productRepo.findByPname(pname);
		return p;
	}


}
