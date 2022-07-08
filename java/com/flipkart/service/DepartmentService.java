package com.flipkart.service;

import java.util.List;

import com.flipkart.entity.Department;

public interface DepartmentService {
//	ADD
//	DELETE ALL
//	UPDATE WITHID
//	DELETE BYID
//	GET ALL
//	GET BY ID
//	Search by name
	
	Department createDepartment(Department dept);
	
	void deleteAllDepartment();
	
	Department updateWithIdDepartment(Department dept, long dept_id);
	
	void deleteByIdDepartment( long dept_id);
	
	List<Department> getAllDepartment();
	
	Department getByIdDepartment( long dept_id);
	
	List<Department> searchDepartment(String deptname);
	
	
}
