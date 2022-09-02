package com.example.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	@Query(value="select * from employee_details where salary>? and salary<?",nativeQuery = true)
	public List<Employee>getBySalaryRange(int salary1,int salary2);
	@Query(value = "select salary from employee_details",nativeQuery = true)
	public List<Integer>getSalary();
	@Query(value = "select name from employee_details where id = ?",nativeQuery = true)
	public String getName(int id);
	@Query(value = "select * from employee_details where id=?",nativeQuery = true)
	public Employee getOnlyName(int id);
	@Query(value = "update employee_details set designation = 'Trainer' where id=?",nativeQuery=true)
	public String change(int id);
	
	
	

}
