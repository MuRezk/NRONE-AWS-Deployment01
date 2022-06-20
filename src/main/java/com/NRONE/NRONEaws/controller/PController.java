package com.NRONE.NRONEaws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PController {

	@RequestMapping("/getname")
	public String getname() {
		return "New Relic TAM Interview";
	}
}
