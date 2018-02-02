/**
 * 
 */
package com.target.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.model.Entity;
import com.target.model.Patient;
import com.target.respository.PatientRepository;

/**
 * @author sroy28
 *
 */
@Service("patientDao")
public  class PatientDao implements PatientDaoI {

	@Autowired
	private PatientRepository  patientRepository;
	
	
	public Patient saveEntity(Entity entity) {
		
		return  patientRepository.save((Patient) entity);
	}

	
	@Override
	public List<Patient> fetchEntity() {
		
		return patientRepository.fetchEntity();
	}

}
