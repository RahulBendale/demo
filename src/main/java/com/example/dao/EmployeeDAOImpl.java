package com.example.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDao{

	@Autowired
	private EntityManager entityManager;

	@Override
	public void save(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(employee);
		//entityManager.persist(employee);
	}
}
