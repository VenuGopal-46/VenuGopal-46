package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demotest {

	@PostMapping("/welcome")
	public String demo(@RequestParam(name="str")String str) {
		if(str.equals("hi")) {
			return "welcome";
		}else {
			return "bye";
		}
	}
}
