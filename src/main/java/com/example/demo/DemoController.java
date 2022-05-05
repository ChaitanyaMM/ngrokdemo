package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/getUsers")
	public User getUsers() {
		User user = new User();
		user.setEmail("chy@gmail.com");
		user.setId(1);
		user.setName("chy");

		return user;
	}

}
