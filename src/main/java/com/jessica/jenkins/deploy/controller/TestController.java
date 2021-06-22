package com.jessica.jenkins.deploy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/test")
public class TestController {
	@RequestMapping(path = "/echo", method = RequestMethod.GET)
	public String echo(@RequestParam String str, HttpServletResponse response) {
		return str;
	}
}