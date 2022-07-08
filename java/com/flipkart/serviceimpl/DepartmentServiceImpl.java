package com.flipkart.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.entity.Department;
import com.flipkart.repo.DepartmentRepo;
import com.flipkart.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	DepartmentRepo deptRepo;
	
	

	@Override
	public Department createDepartment(Department dept) {
		Department d = deptRepo.save(dept);
		return d;
	}

	@Override
	public void deleteAllDepartment() {
		deptRepo.deleteAll();
		
	}

	@Override
	public Department updateWithIdDepartment(Department dept, long dept_id) {
		Optional<Department> optional = deptRepo.findById(dept_id); 
		Department d=null;
        
        if(optional.isPresent()) {
            d=optional.get();
            d.setDeptname(dept.getDeptname());
            d.setDept_id(dept.getDept_id());
            d.setProducts(dept.getProducts());
            deptRepo.save(d);  
        }
		else {
            throw new RuntimeException("Department not found for id::" + dept_id);
        }
		
		return d;
	}

	@Override
	public void deleteByIdDepartment( long dept_id) {
		deptRepo.deleteById(dept_id);
		
	}

	@Override
	public List<Department> getAllDepartment() {
		List<Department> d = deptRepo.findAll();
		return d;
	}

	@Override
	public Department getByIdDepartment( long dept_id) {
		Optional<Department> optional=deptRepo.findById(dept_id);
		Department department=null;
        if(optional.isPresent()) {
            department=optional.get();
        }else {
            throw new RuntimeException("Department not found for id::" + dept_id);
        }
        return department;
    }

	@Override
	public List<Department> searchDepartment(String deptname) {
		List<Department> d = deptRepo.findByDeptname(deptname);
		return d;
	}

}
