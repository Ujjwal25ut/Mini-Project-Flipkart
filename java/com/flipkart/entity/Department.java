package com.flipkart.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dept_id")
	long dept_id;
	private String deptname;
	
	@OneToMany(mappedBy="dept")
	private List<Product> products;
	
	public Department(long dept_id, String deptname, List<Product> products) {
		super();
		this.dept_id = dept_id;
		this.deptname = deptname;
		this.products = products;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getDept_id() {
		return dept_id;
	}

	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
}
