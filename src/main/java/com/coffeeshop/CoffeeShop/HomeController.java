package com.coffeeshop.CoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/") // mapping to our index page
	public ModelAndView indexPage() {
		return new ModelAndView("index", "page", "HELLO WORLD!");
	}

	@RequestMapping("/register") // localhost:8080/teststuff
	public String testPage() {
		return "register"; // string methods in the controller class return the view
	}

	@RequestMapping("username")
	public ModelAndView fromData(@RequestParam("firstName") String fName, @RequestParam("lastName") String lName, @RequestParam("email") String eName, 
			@RequestParam("phone") String pName, @RequestParam("password") String passName) {
		return new ModelAndView("user", "personName", fName + " " +lName + " " + eName + " " 
			+ pName + " " + passName);
	}

//	@RequestMapping("username")
//	public ModelAndView newData(@RequestParam("lastName") String lName) {
//		return new ModelAndView("register", "personName", lName);
//	}
}
