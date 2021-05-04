package com.example.microservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.model.Bill;
import com.example.microservice.repository.BillRepository;
import com.example.microservice.service.BillService;

@RestController
@RequestMapping("api/bills")
public class BillController {
	
	private final BillService billservice;

	public BillController(BillService billservice) {
		this.billservice = billservice;
	}
	@PostMapping
	public ResponseEntity addBill(@RequestBody Bill bill) {
		
		billservice.addBill(bill);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@PutMapping
	public ResponseEntity updateBill(@RequestBody Bill bill) {
		billservice.updateBill(bill);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Bill>> viewBills() {
		
		return ResponseEntity.ok(billservice.viewBills());
	}
	@GetMapping("/{name}")
	public ResponseEntity<Bill> searchBillbyName(@PathVariable String name) {
		
		return ResponseEntity.ok(billservice.searchBillbyName(name));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity deleteBill(@PathVariable String id) {
		billservice.deleteBill(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}
