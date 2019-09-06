package com.athensoft.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.demo.entity.Reservation;

@Controller
@RequestMapping("/demo")
public class DemoFormController {
	
	@RequestMapping("/demofrom")
	//return view
	public String gotoWelcome(Model model) {
		
		Reservation res=new Reservation();
		model.addAttribute("reservation",res);
		
		return "demo/demoform" ;
	}
	
	@RequestMapping("/submitfrom2")
	//return modelandView
	public ModelAndView gotoWelcome2(
			@RequestParam String firstName,
			@RequestParam String lastName) {
		
		ModelAndView mav = new ModelAndView();
		
		Reservation res = new Reservation();
		res.setFirstName(firstName);
		res.setLastName(lastName);
		
		Map<String,Object> data = mav.getModel();
		data.put("reservation",res);
		
		mav.setViewName("demo/demoform");
		
		return mav;
	}

}
