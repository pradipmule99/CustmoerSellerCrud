package com.jspiders.spring.servicepackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jspiders.spring.DTO.CustomerDetailsDTO;
import com.jspiders.spring.DTO.ProductsDTO;
import com.jspiders.spring.DTO.SellerDetailsDTO;
import com.jspiders.spring.Repository.CustomerDetails;
import com.jspiders.spring.Repository.Products;
import com.jspiders.spring.Repository.SellerRepository;

@Service
public class ServiceImplemenation implements ServiceInterface {

	@Autowired
	private CustomerDetails customers;

	@Override
	public CustomerDetailsDTO saveCustomerDetails(CustomerDetailsDTO customerDetails) {
		CustomerDetailsDTO dto = customers.save(customerDetails);
		return dto;
	}

	@Override
	public Iterable<CustomerDetailsDTO> getAllCustomers() {
		Iterable<CustomerDetailsDTO> allCustomers = customers.findAll();
		return allCustomers;
	}

	@Autowired
	private Products products;

	public Iterable<ProductsDTO> getAllProducts() {
		Iterable<ProductsDTO> allProducts = products.findAll();

		return allProducts;

	}

	public ProductsDTO getProductByPrice(double price) {
		ProductsDTO product = products.findByProduct_price(price);
		return product;

	}
	public ProductsDTO getProductByName(String name) {
		ProductsDTO prodcut= products.findByProduct_name(name);
		return prodcut;
		
	}
	public ProductsDTO getProductByType(String type) {
		ProductsDTO product=products.findByProduct_type(type);
		return  product;
	}

	@Autowired
	private SellerRepository seller;
	public SellerDetailsDTO addProductByName(String name) {
		 SellerDetailsDTO dto= seller.saveAll(name);
		 return dto;
		 
		     
	}
	public SellerDetailsDTO removeProductById(int id) {
		SellerDetailsDTO dto2=  seller.deleteAllById(id);
		return dto2;
	}

	public Iterable<ProductsDTO> insert(ProductsDTO productsDTO) {
	
	SellerDetailsDTO dto3=seller.saveAll(productsDTO);
	return (Iterable<ProductsDTO>) dto3;
	}
	
	               

}
