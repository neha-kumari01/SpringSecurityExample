package com.spring.security.ezybanks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class BalanceController {
	
	@GetMapping("/getBalance")
	public String getBalance()
	{
		return "Here is your balance";
	}

}
