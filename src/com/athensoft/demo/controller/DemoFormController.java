package com.athensoft.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.athensoft.demo.entity.Reservation;

@Controller
@RequestMapping("/demo")
public class DemoFormController {
	
	@RequestMapping("/demoform")
	public String gotoWelcome(Model model) {	
		
		Reservation res=new Reservation();  
	      //provide reservation object to the model   
	    model.addAttribute("reservation", res);
		
		return "demo/demoform";
	}
	
	@RequestMapping("/submitForm")
	public String doSubmit(@ModelAttribute("reservation") Reservation res) {	
		return "demo/confirm";
	}
}
