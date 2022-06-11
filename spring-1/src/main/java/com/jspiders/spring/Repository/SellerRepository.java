package com.jspiders.spring.Repository;

import org.springframework.data.repository.CrudRepository;

import com.jspiders.spring.DTO.ProductsDTO;
import com.jspiders.spring.DTO.SellerDetailsDTO;


public interface SellerRepository extends CrudRepository<SellerDetailsDTO, Integer> {

	void getSeller_name();

	SellerDetailsDTO saveAll(ProductsDTO productsDTO);

	SellerDetailsDTO deleteAllById(int id);

	SellerDetailsDTO saveAll(String name);

}

