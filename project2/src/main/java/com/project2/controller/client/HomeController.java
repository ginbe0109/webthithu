package com.project2.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	
	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	   public ModelAndView homePage() {
	      ModelAndView mav = new ModelAndView("client/home");
	      return mav;
	   }
	

	@RequestMapping(value = "/tac-gia", method = RequestMethod.GET)
	   public ModelAndView tacgiaPage() {
	      ModelAndView mav = new ModelAndView("client/tacgia");
	      return mav;
	   }
	  
	
	   
}
