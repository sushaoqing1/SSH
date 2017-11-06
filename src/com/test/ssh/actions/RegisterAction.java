package com.test.ssh.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.test.ssh.entities.Userlogin;
import com.text.ssh.service.EmployeeService;

public class RegisterAction extends ActionSupport implements ModelDriven<Userlogin>, Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String register() {

		boolean a = employeeService.register(userlogin);
		if (a = true) {
			return SUCCESS;
		}
		return "false";

	}

	private void prepareregister() {

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
