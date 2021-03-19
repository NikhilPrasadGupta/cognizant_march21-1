package com.cognizant.ems.dao;

import java.util.List;

import com.cognizant.ems.model.Employee;

/**
 * This EmployeeDAO interface will perform Employee related CRUD operations
 * 
 * @author panka
 *
 */
public interface EmployeeDAO {
	/**
	 * This save method will save the employee in the provided repository
	 * 
	 * @param employee to be saved
	 */
	public void save(Employee employee);

	/**
	 * This update method will update the employee with new employee detail.
	 * 
	 * @param employee to be updated
	 */
	public void update(Employee employee);

	/**
	 * This findAll() method will list out the employees from the repository
	 * 
	 * @return the list of employee if found otherwise null
	 */
	public List<Employee> findAll();

	/**
	 * This delete() method will delete the provided employee from repository
	 * 
	 * @param employee to be deleted
	 */
	public void delete(Employee employee);

	/**
	 * This delete() method will delete the employee by id
	 * 
	 * @param id of the employee to be deleted.
	 */
	public void delete(int id);

}
