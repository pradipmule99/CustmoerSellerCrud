package com.jspiders.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.spring.DTO.CustomerDetailsDTO;
import com.jspiders.spring.DTO.ProductsDTO;
import com.jspiders.spring.response.CustomerResponse;
import com.jspiders.spring.response.ProductResponse;
import com.jspiders.spring.servicepackage.ServiceImplemenation;

@RestController
public class SellerController {

	@Autowired
	private ServiceImplemenation service;

	@GetMapping("/showAllCustomers")
	public ResponseEntity<CustomerResponse> getAllCustomers() {
		Iterable<CustomerDetailsDTO> allCustomers = service.getAllCustomers();
		return new ResponseEntity<CustomerResponse>(new CustomerResponse(false, "FOUND ALL CUSTOMERS", allCustomers),
				HttpStatus.FOUND);
	}
	
	@GetMapping("/insertProduct")
	public ResponseEntity<ProductResponse> insert(@RequestBody ProductsDTO productsDTO){
	Iterable< ProductsDTO>	insert= service.insert(productsDTO);
	return new ResponseEntity<ProductResponse>(new ProductResponse(false, "product inserted"),
			HttpStatus.ACCEPTED);
	}
	@GetMapping("/updateProduct")
	public ResponseEntity<ProductResponse>update (@RequestBody ProductsDTO productsDTO){
		return new ResponseEntity<ProductResponse>(new ProductResponse(false, "Product updated" ),HttpStatus.ACCEPTED);
	}

}
