package com.jspiders.spring.Repository;

import org.springframework.data.repository.CrudRepository;

import com.jspiders.spring.DTO.CustomerDetailsDTO;

public interface CustomerDetails extends CrudRepository<CustomerDetailsDTO, Integer> {

}
