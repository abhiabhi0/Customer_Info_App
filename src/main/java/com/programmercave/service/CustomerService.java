package com.programmercave.service;

import java.util.List;

import com.programmercave.dto.CustomerDTO;

public interface CustomerService {
	public String createCustomer(CustomerDTO customerDTO);
	public List<CustomerDTO> fetchCustomer();
}
