package com.amiyasahu.spm.service;

import com.amiyasahu.spm.dao.SPMapper;
import com.amiyasahu.spm.model.Customer;

public class SPService {
	private SPMapper spMapper ;
	
	public Customer getCustomerById(String id){
		return spMapper.getCustomerById(id);
	}
	
	public SPMapper getSpMapper() {
		return spMapper;
	}

	public void setSpMapper(SPMapper spMapper) {
		this.spMapper = spMapper;
	}
}
