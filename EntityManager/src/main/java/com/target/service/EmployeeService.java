/**
 * 
 */
package com.target.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.dao.EmployeeDaoI;
import com.target.model.Employee;
import com.target.model.Entity;

/**
 * @author sroy28
 *
 */
@Service
public class EmployeeService implements EmployeeServiceI {
	
	@Autowired
	private EmployeeDaoI employeeDao;

	@Override
	public Employee saveEntity(Entity entity) {

		return employeeDao.saveEntity(entity);
	}

	@Override
	public List<Employee> fetchEntity() {

		return employeeDao.fetchEntity();
	}

}
