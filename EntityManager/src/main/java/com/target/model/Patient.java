/**
 * 
 */
package com.target.model;

import org.springframework.data.cassandra.mapping.Table;

/**
 * @author sroy28
 *
 */
@Table("Patient")
public class Patient extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5845362993675707611L;
	private String patientName;
	private String currentDisease;
	private String previousDisease;
	private int weight;
	private int age;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getCurrentDisease() {
		return currentDisease;
	}

	public void setCurrentDisease(String currentDisease) {
		this.currentDisease = currentDisease;
	}

	public String getPreviousDisease() {
		return previousDisease;
	}

	public void setPreviousDisease(String previousDisease) {
		this.previousDisease = previousDisease;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", currentDisease=" + currentDisease + ", previousDisease="
				+ previousDisease + ", weight=" + weight + ", age=" + age + "]";
	}

}
