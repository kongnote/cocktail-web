package com.cocktail_web.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.cocktail_web.domain.User;

@Controller
public class LoginController {

	@PostMapping("/login")
	public String login(Model model, User user) {
		
		System.out.println(user.getUserId());
		return "main";
	}
}
