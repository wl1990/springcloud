package com.demo.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springcloud.service.HelloService;

@RestController
@RefreshScope
public class ClientConfigController {
	@Value("${fwl}")
	private String fwl;
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hi")
	public String hi(){
		String info=helloService.infoService();
		return fwl+"---"+info;
	}
	
}
