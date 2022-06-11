package com.jspiders.spring.servicepackage;

import com.jspiders.spring.DTO.CustomerDetailsDTO;

public interface ServiceInterface {
	 
	
	CustomerDetailsDTO saveCustomerDetails(CustomerDetailsDTO customerDetails);
	
	Iterable<CustomerDetailsDTO> getAllCustomers();
	 

}
