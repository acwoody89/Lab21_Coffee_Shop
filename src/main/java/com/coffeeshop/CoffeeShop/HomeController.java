package com.coffeeshop.CoffeeShop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeshop.CoffeeShop.dao.ItemsDao;
import com.coffeeshop.CoffeeShop.entity.Items;


@Controller
public class HomeController {

	@Autowired
	ItemsDao dao;
	
	@RequestMapping("/") // mapping to our index page
	public ModelAndView indexPage() {
		return new ModelAndView("index", "items", dao.findAll());
	}

//	@RequestMapping("/register") // localhost:8080/teststuff
//	public String testPage() {
//		return "register"; // string methods in the controller class return the view
//	}
	
	@RequestMapping("/register") // localhost:8080/teststuff
	public ModelAndView registerPage() {
		return new ModelAndView("register", "regist", dao.findUser()); // string methods in the controller class return the view
	}

//	@RequestMapping("username")
//	public ModelAndView fromData(@RequestParam("firstName") String fName, @RequestParam("lastName") String lName, @RequestParam("email") String eName, 
//			@RequestParam("phone") String pName, @RequestParam("password") String passName) {
//		
//			dao2.insertUser(fName, lName, eName, pName, passName);
//			return new ModelAndView("index", "items", dao.findAll());
//			
////		return new ModelAndView("user", "personName", fName + " " +lName + " " + eName + " " 
////			+ pName + " " + passName);
//	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam("personid") String name) {
		List<Items> list = new ArrayList<>();
		list = dao.findById(name);
		System.out.println(list);
		return new ModelAndView("search","person", list);
	}
	
	@RequestMapping("username")
	public ModelAndView addNew(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, @RequestParam("phone") String phone,
			@RequestParam("password") String password) {
		
		dao.insertUser(firstName, lastName, email, phone, password);
		
		return new ModelAndView("index", "items", dao.findAll());
	}
	
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("email") String email) {

		dao.deleteCustomer(email);
		return new ModelAndView("index", "regist", dao.findUser());
	}

//	@RequestMapping("username")
//	public ModelAndView newData(@RequestParam("lastName") String lName) {
//		return new ModelAndView("register", "personName", lName);
//	}
}
