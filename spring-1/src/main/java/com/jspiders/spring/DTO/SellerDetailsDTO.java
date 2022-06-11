package com.jspiders.spring.DTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SellerDetailsDTO implements  Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int seller_id;
	private String seller_name;
	private String seller_password;
	private String seller_email;
	

	
	
	

}
