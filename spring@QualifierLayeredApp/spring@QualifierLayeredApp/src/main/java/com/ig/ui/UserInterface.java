package com.ig.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.ig.configuration.SpringConfig;
import com.ig.controller.CustomerLoginController;
import com.ig.dto.CustomerLoginDTO;
import com.ig.exception.InvalidUserException;

public class UserInterface {//tester,runner
	
	public static final Log LOGGER = LogFactory.getLog(UserInterface.class); 
	


	public static void main(String[] args) throws Exception {
		Environment environment=null;
		//ApplicationContext applicationContext =null;
		try{
			AnnotationConfigApplicationContext x= new AnnotationConfigApplicationContext(SpringConfig.class);
			environment=x.getEnvironment();
			CustomerLoginController customerLoginController = x.getBean(CustomerLoginController.class);
			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("harry");
			customerLogin.setPassword("harry123");

			String s=customerLoginController.authenticateCustomer(customerLogin);
			LOGGER.info(environment.getProperty(s));
		}catch(InvalidUserException exception){
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}

	}
}
