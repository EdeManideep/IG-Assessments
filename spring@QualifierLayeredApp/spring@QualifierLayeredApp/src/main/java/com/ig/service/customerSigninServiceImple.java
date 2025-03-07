package com.ig.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ig.dto.CustomerLoginDTO;
import com.ig.exception.InvalidUserException;
import com.ig.repository.CustomerLoginRepository;

@Service (value="B")
//@Component
public class customerSigninServiceImple implements CustomerLoginService 
{

	@Autowired
	private CustomerLoginRepository customerLoginRepository;
	
	

	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InvalidUserException {
		try {
			String toRet = null;
			CustomerLoginDTO customerLoginFromDao = customerLoginRepository
					.getCustomerLoginByLoginName(customerLogin.getLoginName());
			if (customerLogin.getPassword().equals(customerLoginFromDao.getPassword())){
				toRet = "PASS";
			}else{
				throw new InvalidUserException("Service.WRONG_CREDENTIALS");
			}
			return toRet;
			
		}catch(InvalidUserException exception) {
			Log LOGGER = LogFactory.getLog(this.getClass()); 
			LOGGER.error(exception.getMessage(),exception);
			throw exception;
		}

	}
}
