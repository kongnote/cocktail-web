package com.cocktail_web.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	//
	
	// 특정파일 호출의 용도
	@GetMapping("/helloworld")
	public String welcome(Model model, String name, String email, int age) {
		
		System.out.println("name : " + name);
		
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("age", age);
		// template directory 하위에 있는 파일을 호출하게 된다. ex) welcome.html 파일을 찾는다.
		return "welcome";
	}
	
	// 특정파일 호출의 용도
	@GetMapping("/SheSaidYes")
	public String wedding(Model model) {
		

		// template directory 하위에 있는 파일을 호출하게 된다. ex) welcome.html 파일을 찾는다.
		return "wedding";
	}
}
