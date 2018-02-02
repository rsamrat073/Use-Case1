/**
 * 
 */
package com.target.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.model.Entity;
import com.target.model.Product;
import com.target.respository.ProductRepository;

/**
 * @author sroy28
 *
 */
@Service("productDao")
public  class ProductDao implements ProductDaoI{

	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveEntity(Entity entity) {
		
		return   productRepository.save((Product)entity);
	}

	@Override
	public List<Product> fetchEntity() {
		
		return productRepository.fetchEntity();
	}

}
