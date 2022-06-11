package com.jspiders.spring.response;

import org.springframework.http.HttpStatus;

import com.jspiders.spring.DTO.ProductsDTO;

import lombok.Data;

@Data
public class ProductResponse {

	public static final HttpStatus FOUND = null;

	private boolean error;
	
	private String msg;
	
	private ProductsDTO data;
	
	private Iterable<ProductsDTO> list;

	public ProductResponse(boolean error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}

	public ProductResponse(boolean error, String msg, ProductsDTO data) {
		super();
		this.error = error;
		this.msg = msg;
		this.data = data;
	}

	public ProductResponse(boolean error, String msg, Iterable<ProductsDTO> list) {
		super();
		this.error = error;
		this.msg = msg;
		this.list = list;
	}
	
	
}
