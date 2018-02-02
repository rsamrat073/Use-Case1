/**
 * 
 */
package com.target.respository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.target.model.Entity;
import com.target.model.Product;

/**
 * @author sroy28
 *
 */
@Repository
public interface ProductRepository extends CassandraRepository<Entity> {

	@Query("Select * from Product")
	List<Product> fetchEntity();

	
	
}
