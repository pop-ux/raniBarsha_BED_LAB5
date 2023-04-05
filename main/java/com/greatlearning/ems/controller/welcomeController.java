package com.greatlearning.ems.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller


public class welcomeController {
	  @GetMapping("/welcome")
	    public String handleWelcomePage() {
	        return "welcome";
	    }
	

}
