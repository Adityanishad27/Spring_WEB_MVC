package com.myController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class mycontroller {
	
	@GetMapping("/LoginPage")
	
//@RequestMapping(value="/LoginPage")

	public ModelAndView loginPage() {
		
		
		ModelAndView mav= new ModelAndView();
		
		mav.setViewName("OpenLogin");
		return mav;
		
		
	}
	
	
	@GetMapping("about-us")
	public ModelAndView aboutpage() {
		
		ModelAndView mv=  new  ModelAndView();
		mv.setViewName("aboutUS");
		
		return mv;
		
	}

}
