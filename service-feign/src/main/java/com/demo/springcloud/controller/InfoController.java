package com.demo.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springcloud.service.ScheduleServiceInfo;

@RestController
public class InfoController {
	@Autowired
	ScheduleServiceInfo scheduleServiceInfo;
	
	@RequestMapping(value="/info",method=RequestMethod.GET)
	public String info(){
		System.out.println("-----------"+scheduleServiceInfo.infoFromclient());
		return scheduleServiceInfo.infoFromclient();
	}
}
