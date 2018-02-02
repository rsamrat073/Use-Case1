package com.target.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.dao.EntityDaoI;
import com.target.model.Entity;
import com.target.model.Product;


@Service
public class ProductService implements ProductServiceI {

	@Autowired
	private EntityDaoI productDao;

	@Override
	public Product saveEntity(Entity entity) {
		System.out.println(entity);
		return (Product) productDao.saveEntity(entity instanceof Product?(Product)entity:entity);
	}

	@Override
	public List<Product> fetchEntity() {

		return  productDao.fetchEntity();
	}

}
