package com.flipkart.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

	List<Department> findByDeptname(String deptname);
}
