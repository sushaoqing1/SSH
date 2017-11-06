package com.text.ssh.service;

import java.util.List;

import com.test.ssh.dao.EmployeeDao;
import com.test.ssh.entities.Employee;
import com.test.ssh.entities.Userlogin;

public class EmployeeService {
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	public void delete(Integer id) {
		employeeDao.delete(id);
	}

	public void saveOrUpdate(Employee employee) {
		employeeDao.saveOrUpdate(employee);
	}

	public Employee get(Integer id) {
		return employeeDao.get(id);
	}

	public boolean login(Userlogin userlogin) {
		return employeeDao.checkUserExistsWithName(userlogin);
	}

	public boolean register(Userlogin userlogin) {
		return employeeDao.save(userlogin);
	}
}
