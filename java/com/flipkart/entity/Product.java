package com.flipkart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "p_id")
	private long p_id;
	
	@ManyToOne
	private Department dept;
	
	
	private String pname;
	private long price;
	private String feature;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return p_id;
	}
	public void setId(long id) {
		this.p_id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public Product(long id, String pname, long price, String feature) {
		super();
		this.p_id = id;
		this.pname = pname;
		this.price = price;
		this.feature = feature;
	}
}
