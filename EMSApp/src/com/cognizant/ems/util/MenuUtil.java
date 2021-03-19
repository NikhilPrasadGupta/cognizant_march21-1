package com.cognizant.ems.util;

import java.util.List;
import java.util.Scanner;

import com.cognizant.ems.model.Employee;
import com.cognizant.ems.service.EmployeeService;
import com.cognizant.ems.serviceimpl.EmployeeServiceImpl;

public class MenuUtil {
	
	private EmployeeService employeeService;
	
	public MenuUtil() {
		employeeService=new EmployeeServiceImpl();
	}

	public void start() {
		int choice;
		String continueChoice;
		Scanner sc = new Scanner(System.in);

		do {
			showMenu();
			System.out.println("Enter your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Employee employee = new Employee();
				System.out.println("Employee Name : ");
				employee.setName(sc.next());
				System.out.println("Employee Salary:");
				employee.setSalary(sc.nextDouble());
				System.out.println("Employee Department : ");
				employee.setDepartment(sc.next());
				employee.setId(System.currentTimeMillis());
				
				employeeService.createEmployee(employee);
				break;
			case 2:
				System.out.println("------Here is your Employee List---------");
				List<Employee> employees = employeeService.showEmployees();
				for (Employee emp : employees) {
					System.out.println(emp);
				}
				break;
			case 3:
				System.out.println("Employee Updated....");
				break;
			case 4:
				System.out.println("Employee Deleted....");
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice=sc.next();
		} while(continueChoice.equals("yes"));

	}

	private void showMenu() {
		System.out.println("----------Main Menu-----------");
		System.out.println("1. Create Employee");
		System.out.println("2. List Employees");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("0. Exit");
	}

}
