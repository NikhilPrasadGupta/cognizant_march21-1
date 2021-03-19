package com.cognizant.ems.service;

import java.util.List;

import com.cognizant.ems.model.Employee;

/**
 * This EmployeeService interface will perform all the Employee related services like 
 * Create employee, Show Employees, Remove Employee, Edit Employee
 * @author panka
 *
 */
public interface EmployeeService {

	/**
	 * This createEmployee() method will create the employee in the system
	 * @param employee
	 */
	public void createEmployee(Employee employee);
	/**
	 * This showEmployees() method will show all the available employees in the system 
	 * @return available employees if found otherwise null
	 */
	public List<Employee> showEmployees();
	/**
	 * This editEmployee() method will change the provided detail in the employee
	 * @param employee to be changed
	 */
	public void editEmployee(Employee employee);
	/**
	 * This removeEmployee() method will remove the employee from the syste
	 * @param employee to be removed
	 */
	public void removeEmployee(Employee employee);
}
