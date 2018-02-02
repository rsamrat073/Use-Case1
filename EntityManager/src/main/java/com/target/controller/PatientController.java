/**
 * 
 */
package com.target.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.model.Patient;

/**
 * @author sroy28
 *
 */
@RestController
@RequestMapping(value="/patient")
public class PatientController extends EntityController<Patient> {

}
