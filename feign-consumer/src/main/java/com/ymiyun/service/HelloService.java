package com.ymiyun.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("hello-service")
public interface HelloService {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String hello(@RequestParam("name") String name);

}
