package com.cognizant.ems.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.ems.dao.EmployeeDAO;
import com.cognizant.ems.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private List<Employee> employeeRepository = new ArrayList<>();

	@Override
	public void save(Employee employee) {
		employeeRepository.add(employee);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository;
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
