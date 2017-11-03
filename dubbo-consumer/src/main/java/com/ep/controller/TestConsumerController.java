package com.ep.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ep.service.register.TestRegisterService;

@Controller
public class TestConsumerController {
	
	@Autowired
	//@Reference
	private TestRegisterService testRegisterService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public void hello(){
		System.out.println(testRegisterService);
		String hello = testRegisterService.hello();
		
		System.out.println("this is consumer: "+hello);
	}

}
