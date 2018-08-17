package com.capgemini.ForgotPassword.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ForgotPassword.bean.Customer;
import com.capgemini.ForgotPassword.service.CustomerService;
@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@RequestMapping("/getcustomer")
	public Optional<Customer> getProductById(@RequestParam String id)
	{
		return service.getCustomerById(Integer.parseInt(id));	
	}
}
