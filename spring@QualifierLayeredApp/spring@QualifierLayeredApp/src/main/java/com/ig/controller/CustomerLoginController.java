package com.ig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ig.dto.CustomerLoginDTO;
import com.ig.exception.InvalidUserException;
import com.ig.service.CustomerLoginService;

@Controller // (value = "x")
//@Component  //service repository controller
public class CustomerLoginController {

	 @Autowired  //implicit DI
 	@Qualifier("B")
	private CustomerLoginService customerLoginService;//new ,getBean()
	
	
	
	
	//  @Autowired //constructor autowiring public
	//  @Qualifier("A")
	 // CustomerLoginController(CustomerLoginService customerLoginService) {
	//  this.customerLoginService = customerLoginService;
	//  }
	 

	
	/*
	 * public CustomerLoginService getCustomerLoginService() { return
	 * customerLoginService; }
	 * 
	 * @Autowired //setter autowiring public void public void
	 * setCustomerLoginService(CustomerLoginService customerLoginService) {
	 * this.customerLoginService = customerLoginService; }
	 */
	 

	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InvalidUserException {
		return customerLoginService.authenticateCustomer(customerLogin);

	}

	

}
