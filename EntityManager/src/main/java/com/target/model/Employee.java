/**
 * 
 */
package com.target.model;

import org.springframework.data.cassandra.mapping.Table;

/**
 * @author sroy28
 *
 */
@Table("Employee")
public class Employee extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1969041298724648155L;
	private String empName;
	private String empCode;
	private int empSalary;
	private String technologyStack;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getTechnologyStack() {
		return technologyStack;
	}

	public void setTechnologyStack(String technologyStack) {
		this.technologyStack = technologyStack;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empCode=" + empCode + ", empSalary=" + empSalary
				+ ", technologyStack=" + technologyStack + "]";
	}

}
