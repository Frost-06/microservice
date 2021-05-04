package com.example.microservice.circle;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;


public class areaofcircle {

	@Id 
	private String id;
	@Field(name = "Name")
	private String name;
	@Indexed(unique=true)
	@Field(name = "radius")
	private BigDecimal radius;
	
	public areaofcircle(String id, String name, BigDecimal radius){
		this.id = id;
		this.name = name;
		this.radius = radius;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getRadius() {
		return radius;
	}

	public void setRadius(BigDecimal radius) {
		this.radius = radius;
	}++
	
}
