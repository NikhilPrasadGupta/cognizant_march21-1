package com.cognizant.ems.serviceimpl;

import java.util.List;

import com.cognizant.ems.dao.EmployeeDAO;
import com.cognizant.ems.daoimpl.EmployeeDAOImpl;
import com.cognizant.ems.model.Employee;
import com.cognizant.ems.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl() {
		employeeDAO=new EmployeeDAOImpl();
	}

	@Override
	public void createEmployee(Employee employee) {
		//TODO : provide biz logic here
		employeeDAO.save(employee);

	}

	@Override
	public List<Employee> showEmployees() {
		// TODO provide biz logic here
		return employeeDAO.findAll();
	}

	@Override
	public void editEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

}
