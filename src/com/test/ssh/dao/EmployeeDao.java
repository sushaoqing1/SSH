package com.test.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.ssh.entities.Employee;
import com.test.ssh.entities.Userlogin;

public class EmployeeDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public List<Employee> getAll() {
		String hql = "FROM Employee";

		return getSession().createQuery(hql).list();
	}

	public void delete(Integer id) {
		String hql = "DELETE FROM Employee e WHERE e.id = ?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}

	public void saveOrUpdate(Employee employee) {
		getSession().saveOrUpdate(employee);
	}

	public Employee get(Integer id) {
		return (Employee) getSession().get(Employee.class, id);

	}

	public boolean checkUserExistsWithName(Userlogin userlogin) {
		String hql = "from Userlogin u where u.username=:username and u.password=:password ";
		List<Userlogin> list = (List<Userlogin>) this.getSession().createQuery(hql)
				.setString("username", userlogin.getUsername()).setString("password", userlogin.getPassword()).list();

		if (list != null && list.size() > 0) {
			return true;
		}

		return false;
	}

	public boolean save(Userlogin userlogin) {
		if (userlogin.getUsername() != null && userlogin.getPassword() != null) {
			getSession().save(userlogin);
			return true;
		}
		return false;

	}
}
