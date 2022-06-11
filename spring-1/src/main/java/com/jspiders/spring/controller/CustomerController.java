package com.jspiders.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.spring.DTO.ProductsDTO;
import com.jspiders.spring.response.ProductResponse;
import com.jspiders.spring.servicepackage.ServiceImplemenation;

@RestController
public class CustomerController {

	@Autowired
	private ServiceImplemenation service;

	@GetMapping("/allProducts")
	public ResponseEntity<ProductResponse> getAllProducts() {
		Iterable<ProductsDTO> allProducts = service.getAllProducts();
		return new ResponseEntity<ProductResponse>(new ProductResponse(false, "FOUND ALL PRODUCTS", allProducts),
				HttpStatus.FOUND);
	}

	@GetMapping("/productByPrice")
	public ResponseEntity<ProductResponse> productByPrice(@RequestParam double price) {
		ProductsDTO productByPrice = service.getProductByPrice(price);
		return new ResponseEntity<ProductResponse>(new ProductResponse(false, "Found product", productByPrice),
				HttpStatus.FOUND);
	}
	@GetMapping("/productByName")
	public ResponseEntity<ProductResponse>productByName(@RequestParam String name){
	ProductsDTO productByName	=service.getProductByName(name);
	 return new ResponseEntity<ProductResponse>(new ProductResponse(false, "found product",productByName),
			 HttpStatus.FOUND);
	}
	@GetMapping("/productByType")
	public ResponseEntity<ProductResponse>productByType(@RequestParam String type){
	ProductsDTO productByType	=service.getProductByType(type);
	return new ResponseEntity<ProductResponse>(new ProductResponse(false, "product type found", productByType),
			HttpStatus.FOUND);
	}

}
