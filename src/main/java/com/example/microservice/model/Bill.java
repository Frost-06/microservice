package com.example.microservice.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

public class Bill {


	//Declare Instance variables/fields
	@Id 
	private String id;
	@Field(name = "name")
	private String billName;
	@Indexed(unique=true)
	@Field(name = "category")
	private BillCategory billcategory;
	@Field(name = "amount")
	private BigDecimal billamount;
	
	public Bill(String id, String billName, BillCategory billcategory, BigDecimal billamount) {
		this.id = id;
		this.billName = billName;
		this.billcategory = billcategory;
		this.billamount = billamount;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public BillCategory getBillcategory() {
		return billcategory;
	}

	public void setBillcategory(BillCategory billcategory) {
		this.billcategory = billcategory;
	}

	public BigDecimal getBillamount() {
		return billamount;
	}

	public void setBillamount(BigDecimal billamount) {
		this.billamount = billamount;
	}
	
	
}
