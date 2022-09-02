package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDaO empDao;
	public String add(Employee emp) {
		return empDao.add(emp);
	}
	public String update(Employee emp) {
		return empDao.update(emp);
	}
	public String delete(int id) {
		return empDao.delete(id);
	}
	public Employee getById(int id) {
		return empDao.getById(id);
	}
	public List<Employee>getAll() {
		return empDao.getAll();
	}
	public String addAll(List<Employee> emp) {
		return empDao.addAll(emp);
	}
	public String deleteAll() {
		return empDao.deleteAll();
	}
	public List<Employee>getBySalaryRange(int salary1,int salary2) {
		return empDao.getBySalaryRange(salary1,salary2);
	}
	public List<Integer>getSalary() {
		return empDao.getSalary();
	}
	public String getOnlyName(int id) {
		return empDao.getOnlyName(id).getName();
	}
	public int getSalaryThroughId(int a) {
		int b = empDao.getSalaryThroughId(a).getSalary();
		return b;
	}
	public String change(int id) {
		return empDao.change(id);
	}

}
