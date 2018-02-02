/**
 * 
 */
package com.target.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.target.model.Entity;
import com.target.service.EntityServiceI;

/**
 * @author sroy28
 *
 */

public class EntityController<T extends Entity> {

	@Autowired
	private EntityServiceI<T> entityService;

	@RequestMapping(method=RequestMethod.POST)
	public T saveEntity(@RequestBody T t) {
		
		return entityService.saveEntity(t);
	}

	
	@RequestMapping(method=RequestMethod.GET)
	public List<T> fetchEntity() {

		return entityService.fetchEntity();
	}
	
	

}
