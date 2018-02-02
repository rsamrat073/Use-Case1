/**
 * 
 */
package com.target.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.model.Employee;
import com.target.model.Entity;
import com.target.respository.EmployeeRepository;

/**
 * @author sroy28
 *
 */
@Service("employeeDao")
public  class EmployeeDao implements EmployeeDaoI {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public Employee saveEntity(Entity entity) {
		
		return employeeRepository.save((Employee) entity);
	}

	
	@Override
	public List<Employee> fetchEntity() {
		
		return employeeRepository.fetchEntity() ;
	}

}
