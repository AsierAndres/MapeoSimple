package com.sistema.hibernate.examen;

import java.util.List;

import com.sistema.hibernate.examen.DAO.EmployeeDAO;
import com.sistema.hibernate.examen.DAOInterface.InterfaceEmployeeDAO;
import com.sistema.hibernate.examen.models.Employee;

class App {
	public static void main(String[] args) {
		InterfaceEmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.insert(new Employee("Emp1", "Emp1@Emp1.com", 666f));
		employeeDAO.insert(new Employee("Emp2", "Emp2@Emp2.com", 565f));
		employeeDAO.insert(new Employee("Emp3", "Emp3@Emp3.com", 13000f));

		List<Employee> employees = employeeDAO.selectAll();
		for (Employee empleado : employees) {
			System.out.println(empleado.toString());
		}
	}
}
