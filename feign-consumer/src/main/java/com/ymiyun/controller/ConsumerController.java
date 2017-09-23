package com.ymiyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ymiyun.service.HelloService;

@RestController
public class ConsumerController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name) {
		return helloService.hello(name);
	}
}
