package com.target.service;

import java.util.List;

import com.target.model.Entity;

public interface EntityServiceI<T> {

	T saveEntity(Entity entity);

	List<T> fetchEntity();

}
