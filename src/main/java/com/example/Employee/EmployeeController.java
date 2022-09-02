package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	@PostMapping(value = "/post")
	public String add(@RequestBody Employee emp) {
		return empService.add(emp);
	}
	@PutMapping(value = "/update")
	public String update(@RequestBody Employee emp) {
		return empService.update(emp);
	}
	@DeleteMapping(value = "/delete/{id}")
	public String delete(@PathVariable int id)
	{
		return empService.delete(id);
	}
	
	@GetMapping("get/{id}")
	public Employee getById(@PathVariable int id) {
		return empService.getById(id);
	}
	
	@GetMapping("getAll")
	public List<Employee>getAll() {
		return empService.getAll();
	}
	@PostMapping("Bulk")
	public String addAll(@RequestBody List<Employee> emp) {
		return empService.addAll(emp);
	}
	@DeleteMapping("deleteAll") 
		public String deleteAll() {
			return empService.deleteAll();
		}
	@GetMapping("getBySalary/{from}/{to}")
	public List<Employee> getBySalaryRange(@PathVariable("from") int salary1,@PathVariable("to")int salary2) {
		return empService.getBySalaryRange(salary1,salary2);
	}
	@GetMapping(value = "getsalary")
	public List<Integer>getSalary() {
		return empService.getSalary();
	}
	@GetMapping(value = "getEmpsalary/{a}")
	public int getSalaryThroughId(@PathVariable int a) {
		return getSalaryThroughId(a);
	}
	
	@GetMapping("getName/{id}")
	public String getOnlyName(@PathVariable int id) {
		return empService.getOnlyName(id);
	}
	
	@GetMapping("check")
	public String checkQuery(@RequestParam String name,@RequestParam String password) {
		if(name.equals("thamil")&&password.equals("01234")) {
			return "Access Verified";
		}
		else
		{
			return "Access Denined";
		}
	/*@PatchMapping("change/{id}")
	public String change(@PathVariable int id) {
		return empService.change(id); }*/
		
	}
}
	
