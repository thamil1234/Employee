package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaO {
	@Autowired
	EmployeeRepository empRepo;
	public String add(Employee emp) {
		empRepo.save(emp);
		return "Data has been saved Sucessfully";
	}
	public String update(Employee emp) {
		empRepo.save(emp).getId();
		return "Data updated Successfully";
	}
	public String delete(int id) {
		empRepo.deleteById(id);
		return "Data has been deleted Successfully";
	}
	public Employee getById(int id) {
		return empRepo.findById(id).get();
	}
	public List<Employee> getAll() {
		return empRepo.findAll();
	}
	public String addAll(List<Employee> emp) {
		empRepo.saveAll(emp);
		return "All Added";
	}
	public String deleteAll() {
		empRepo.deleteAll();
		return "All Data has been Deleted";
	}
	
	public List<Employee>getBySalaryRange(int salary1,int salary2) {
		return empRepo.getBySalaryRange(salary1,salary2);
	}
	public List<Integer>getSalary() {
		return empRepo.getSalary();
	}
	public Employee getOnlyName(int id) {
		return empRepo.getOnlyName(id);
	}
	public Employee getSalaryThroughId(int a) {
		return empRepo.findById(a).get();
	}
	public String change(int id) {
		return empRepo.change(id);	
		}
	

}
