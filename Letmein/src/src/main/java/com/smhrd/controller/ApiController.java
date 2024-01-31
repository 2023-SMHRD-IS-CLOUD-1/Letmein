package com.smhrd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller : 동기
// @RestController : 비동기 통신

@RestController
public class ApiController {

	@RequestMapping("/test")
	public String test() {

		return "Hello World";
	}
}
