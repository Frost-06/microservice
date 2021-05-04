package com.example.microservice.area;

import java.util.List;

import com.example.microservice.arearepository.repository;
import com.example.microservice.circle.areaofcircle;
import com.example.microservice.arearepository.repository;

public class areacontrol {
	
	private final repository repository;{
		
	}
		public void areaofcircle(repository repository) {
			this.repository = repository;
		}
		public void addcircle(areaofcircle areofcircle) {
			Object areaofcircle;
			repository.insert(areaofcircle);
		}
		public void updateBill(areaofcircle areaofcircle) {
			areaofcircle savedbill = repository.findById(areaofcircle.getId())
					.orElseThrow(()-> new RuntimeException(String.format("Cannnot find area by ID %s", areaofcircle.getId())));
			savedbill.setName(areaofcircle.getName());
			savedbill.setRadius(areaofcircle.getBillcategory());
			savedbill.setBillamount(bill.getBillamount());
			billrepository.save(bill);
		}
		public List<Bill> viewBills() {
			return billrepository.findAll();
		}
		
		public Bill searchBillbyName(String name) {
			
			return billrepository.findbyName(name).
					orElseThrow(()->new RuntimeException(String.format("Cannot find name %s", name)));
		}
		public void deleteBill(String id) {
			billrepository.deleteById(id);
		}
	}
