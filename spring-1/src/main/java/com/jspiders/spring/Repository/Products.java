package com.jspiders.spring.Repository;

import org.springframework.data.repository.CrudRepository;

import com.jspiders.spring.DTO.ProductsDTO;

public interface Products extends CrudRepository<ProductsDTO, Integer> {
	
	ProductsDTO findByProduct_price(double price);
	
	ProductsDTO findByProduct_name1(String type);

	ProductsDTO findByProduct_name(String type);

	ProductsDTO findByProduct_type(String type);

}
