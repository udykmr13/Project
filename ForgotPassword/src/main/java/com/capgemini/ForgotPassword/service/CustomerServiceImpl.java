package com.capgemini.ForgotPassword.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ForgotPassword.bean.Customer;
import com.capgemini.ForgotPassword.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo repo;
	
	public Optional< Customer >getCustomerById(int id){
		
		return repo.findById(id);
	}
	
}
