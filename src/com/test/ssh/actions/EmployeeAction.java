package com.test.ssh.actions;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.test.ssh.entities.Employee;
import com.text.ssh.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements RequestAware, ModelDriven<Employee>, Preparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String list() {

		request.put("employees", employeeService.getAll());
		return "list";
	}

	private Integer id;

	public String delete() {
		employeeService.delete(id);
		return "delete";
	}

	public String input() {
		return INPUT;
	}

	public void prepareInput() {
		if (id != null) {
			employee = employeeService.get(id);
		}
	}

	public String save() {
		employeeService.saveOrUpdate(employee);
		return SUCCESS;
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public void prepare() throws Exception {

	}

	private void prepareSave() {

		employee = new Employee();
	}

	private Employee employee = new Employee();

	@Override
	public Employee getModel() {

		return employee;
	}

}
