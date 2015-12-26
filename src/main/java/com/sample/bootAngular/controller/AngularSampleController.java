package com.sample.bootAngular.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AngularSampleController {
	
	@RequestMapping("/sample")
	public Map<String, Object> angularBootController() {
		Map<String, Object> valuesMap = new HashMap<String, Object>();
		valuesMap.put("id", UUID.randomUUID().toString());
		valuesMap.put("content", "Wow its Angular using Spring Boot");
		return valuesMap;
	}
	
	@RequestMapping("/abc")
	public String abc() {
		return "Pleaseeeeeeeee";
	}

}
