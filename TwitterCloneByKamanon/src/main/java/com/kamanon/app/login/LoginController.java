package com.kamanon.app.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	private final String HOME_SHOW = "home/home_show";

	@RequestMapping("/home")
	ModelAndView showHome() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName(HOME_SHOW);
		return mav;
	}
}
