package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.entity.Department;
import com.flipkart.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService deptService;
	
	@PostMapping(value = "/addDept")
	Department createDepartment(@RequestBody Department dept) {
		Department d= deptService.createDepartment(dept);
		return d;
	}
	
	@DeleteMapping(value = "/deleteDept")
	void deleteAllDepartment( ) {
		deptService.deleteAllDepartment();
	}
	
	@PutMapping(value = "/update/{dept_id}")
	Department updateWithIdDepartment(@RequestBody Department dept, @PathVariable long dept_id) {
		Department d= deptService.updateWithIdDepartment(dept , dept_id);
		return d;
	}
	
	@DeleteMapping(value = "/delete/{dept_id}")
	void deleteByIdDepartment(@PathVariable("dept_id") long dept_id) {
		deptService.deleteByIdDepartment(dept_id);
	
	}
	
	@GetMapping(value = "/getDept")
	List<Department> getAllDepartment(){
	List<Department> d = deptService.getAllDepartment();
	return d;
		
	}
	
	@GetMapping(value = "/getDept/{id}")
	Department getByIdDepartment( @PathVariable("id") long dept_id) {
	Department d = deptService.getByIdDepartment( dept_id);
	return d;
		
	}
	
	@GetMapping(value = "/search/{deptname}")
	public List<Department> searchDepartment(@PathVariable String deptname){
		List<Department> d = deptService.searchDepartment(deptname);
		return d;
		
	}
}
