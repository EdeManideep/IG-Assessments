package com.ig.repository;

import com.ig.dto.CustomerLoginDTO;

public interface CustomerLoginRepository {
	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
