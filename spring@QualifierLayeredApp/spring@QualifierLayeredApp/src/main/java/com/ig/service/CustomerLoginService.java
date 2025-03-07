package com.ig.service;

import com.ig.dto.CustomerLoginDTO;
import com.ig.exception.InvalidUserException;

public interface CustomerLoginService {
	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InvalidUserException;
}
