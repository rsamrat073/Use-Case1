/**
 * 
 */
package com.target.respository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.target.model.Patient;

/**
 * @author sroy28
 *
 */
@Repository
public interface PatientRepository extends CassandraRepository<Patient> {

	
	@Query("select * from Patient")
	List<Patient> fetchEntity();

	
	
	
}
