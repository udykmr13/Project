package com.capgemini.ForgotPassword.service;

import java.util.Optional;

import com.capgemini.ForgotPassword.bean.Customer;

public interface CustomerService {

	
	public Optional<Customer>getCustomerById(int id);
}
