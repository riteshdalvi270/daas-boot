package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/")
public class ShipWreskResource {

	@RequestMapping(value="shipwreck",method=RequestMethod.GET)
	public void getAllShips() {
		
	}
}
