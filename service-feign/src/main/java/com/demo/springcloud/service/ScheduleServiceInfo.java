package com.demo.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="sc-service-0")
public interface ScheduleServiceInfo {
	@RequestMapping(value="/info",method=RequestMethod.GET)
	String infoFromclient();
}
