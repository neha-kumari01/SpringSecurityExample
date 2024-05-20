package com.spring.security.ezybanks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class CardsController {
	
	@GetMapping("/myCards")
	public String getCardDetails()
	{
		return "Here is the list of cards";
	}

}
