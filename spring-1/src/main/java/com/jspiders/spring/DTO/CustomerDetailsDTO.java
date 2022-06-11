package com.jspiders.spring.DTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CustomerDetailsDTO implements Serializable {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int customer_id;
	private String customer_name;
	private String customer_password;
	private long custmor_mobileno;
	private String customer_email;
	
	

}
