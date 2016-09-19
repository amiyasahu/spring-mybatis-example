package com.amiyasahu.spm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.amiyasahu.spm.model.Customer;

public class DBOperations {

	@Autowired
	private SPService service;

	public void showOneCustomerById(String id) {
		Customer customer = service.getCustomerById(id);
		System.out.println(customer.getCustomernumber() + "--" + customer.getCustomername());
	}
}
