package com.cognizant.ems.model;
/**
 * This Employee class will be used as a data traveller object between layers. 
 * @author panka
 *
 */
public class Employee {

	/**
	 * id of the employee
	 */
	private Long id;
	/**
	 * name of the employee
	 */
	private String name;
	/**
	 * salary of the employee
	 */
	private double salary;
	/**
	 * department of the employee
	 */
	private String department;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	
}
