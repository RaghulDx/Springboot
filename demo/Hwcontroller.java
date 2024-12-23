package com.raghul.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hwcontroller {
	@RequestMapping("/restapi")
	public String restApi() {
		return "raghul";
		
	}

}
