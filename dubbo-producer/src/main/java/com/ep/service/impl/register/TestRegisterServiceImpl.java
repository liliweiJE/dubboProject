package com.ep.service.impl.register;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ep.service.register.TestRegisterService;

@Component
@Service("testRegisterService")
public class TestRegisterServiceImpl implements TestRegisterService {

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "world";
	}

}
