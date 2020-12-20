package com.koji.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model, HttpServletRequest request) {
		
		model.addAttribute("SESSION_ID", request.getSession().getId());

		return "index";
	
	}

	@PostMapping("invalidate")
	public String invalidate(Model model, HttpServletRequest request) {
		
		request.getSession().invalidate();

		return "redirect:/";
	
	}

}
