/**
 * 
 */
package com.target.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.dao.EntityDaoI;
import com.target.model.Entity;
import com.target.model.Patient;

/**
 * @author sroy28
 *
 */

@Service
public class PatientService implements PatientServiceI {

	@Autowired
	private EntityDaoI patientDao;

	@Override
	public Patient saveEntity(Entity entity) {

		return (Patient) patientDao.saveEntity(entity);
	}

	@Override
	public List<Patient> fetchEntity() {

		return  patientDao.fetchEntity();
	}

}
