/**
 * 
 */
package com.target.dao;

import java.util.List;

import com.target.model.Entity;

/**
 * @author sroy28
 *
 */
public interface EntityDaoI<T> {
	
	
	public T saveEntity(Entity entity);

	public List<T> fetchEntity();
	

}
