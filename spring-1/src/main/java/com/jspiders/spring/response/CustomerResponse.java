package com.jspiders.spring.response;

import com.jspiders.spring.DTO.CustomerDetailsDTO;

import lombok.Data;

@Data
public class CustomerResponse {

	private boolean error;

	private String msg;

	private CustomerDetailsDTO data;

	private Iterable<CustomerDetailsDTO> list;

	public CustomerResponse(boolean error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}

	public CustomerResponse(boolean error, String msg, CustomerDetailsDTO data) {
		super();
		this.error = error;
		this.msg = msg;
		this.data = data;
	}

	public CustomerResponse(boolean error, String msg, Iterable<CustomerDetailsDTO> list) {
		super();
		this.error = error;
		this.msg = msg;
		this.list = list;
	}

}
