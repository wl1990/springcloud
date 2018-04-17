package com.demo.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHiHystric implements ScheduleServiceInfo{

	@Override
	public String infoFromclient() {
		return "say sorry!";
	}
}
