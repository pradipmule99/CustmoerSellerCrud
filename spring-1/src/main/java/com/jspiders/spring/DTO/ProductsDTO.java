package com.jspiders.spring.DTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductsDTO implements Serializable{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int product_id;
	
	private String product_name;
	private String product_type;
	private String product_category;
	private double product_price;
	
	

}
