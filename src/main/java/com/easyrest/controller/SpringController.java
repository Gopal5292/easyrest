package com.easyrest.controller;

import com.easyrest.ro.EasyRestRO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SpringController {

	private static final Logger logger = LoggerFactory.getLogger(SpringController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String createEasyRest(@RequestBody EasyRestRO easyRest) {
		return null;
	}

	@RequestMapping(value = "/requestmethod", method = RequestMethod.GET)
	public List<String> getRequestMethods(){

		return new ArrayList<String>();
	}



}
