package com.sistema.hibernate.examen.DAO;

import java.util.List;

import org.hibernate.*;

import com.sistema.hibernate.examen.HibernateSession;
import com.sistema.hibernate.examen.DAOInterface.InterfaceEmployeeDAO;
import com.sistema.hibernate.examen.models.Employee;

public class EmployeeDAO implements InterfaceEmployeeDAO {

	public List<Employee> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Employee> employees = session.createCriteria(Employee.class).list();
		session.close();
		return employees;
	}

	public void insert(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
	}

	public void update(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(employee);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
	}

}
