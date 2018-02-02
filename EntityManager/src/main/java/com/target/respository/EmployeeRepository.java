/**
 * 
 */
package com.target.respository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.target.model.Employee;

/**
 * @author sroy28
 *
 */
@Repository
public interface EmployeeRepository extends CassandraRepository<Employee> {

	@Query("Select * Employee")
	List<Employee> fetchEntity();

	
	
	
}
