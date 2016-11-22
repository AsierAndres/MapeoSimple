package com.sistema.hibernate.examen.DAOInterface;

import java.util.List;

import com.sistema.hibernate.examen.models.Employee;

public interface InterfaceEmployeeDAO {

	public List<Employee> selectAll();

	public void insert(Employee employee);

	public void update(Employee employee);

	public void delete(Employee employee);
}
