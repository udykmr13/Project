package com.capgemini.ForgotPasswordMvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.ForgotPasswordMvc.bean.Customer;


@RestController
public class CustomerController {
	@RequestMapping("/customers")
	public Customer getproduct(@RequestParam String id)
	{
		RestTemplate rt = new RestTemplate();
		Customer c = rt.getForObject("http://localhost:9902/getproducts?id="+id, Customer.class);
		return c;
	}
}
