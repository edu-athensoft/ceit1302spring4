package com.athensoft.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.athensoft.demo.entity.Reservation;

@Controller
@RequestMapping("/demo")
public class DemoResponseController {
	
	@RequestMapping("/resdata")
	@ResponseBody
	public Reservation getRes() {
		Reservation res = new Reservation();
		String firstName = "aaa_firstName";
		String lastName = "bbb_lastName";
		res.setFirstName(firstName);
		res.setLastName(lastName);
		return res;
	}
	
	@RequestMapping("/res")
	public String gotoReservation() {
		return "demo/reservation";
	}
}
