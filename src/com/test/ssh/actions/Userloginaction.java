package com.test.ssh.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.test.ssh.entities.Userlogin;
import com.text.ssh.service.EmployeeService;

public class Userloginaction extends ActionSupport implements ModelDriven<Userlogin>, Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String login() {

		employeeService.login(userlogin);
		if (employeeService.login(userlogin) == false) {
			return "false";
		}
		return SUCCESS;

	}

	private void preparelogin() {

		userlogin = new Userlogin();
	}

	@Override
	public void prepare() throws Exception {
	}

	private Userlogin userlogin = new Userlogin();

	@Override
	public Userlogin getModel() {
		// TODO Auto-generated method stub
		return userlogin;
	}

}
