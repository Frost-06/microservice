package com.example.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.microservice.model.Bill;
import com.example.microservice.repository.BillRepository;


@Service
public class BillService {

	private final BillRepository billrepository;

	public BillService(BillRepository billrepository) {
		this.billrepository = billrepository;
	}
	public void addBill(Bill bill) {
		billrepository.insert(bill);
	}
	public void updateBill(Bill bill) {
		Bill savedbill = billrepository.findById(bill.getId())
				.orElseThrow(()-> new RuntimeException(String.format("Cannnot find bill by ID %s", bill.getId())));
		savedbill.setBillName(bill.getBillName());
		savedbill.setBillcategory(bill.getBillcategory());
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
	}
}
