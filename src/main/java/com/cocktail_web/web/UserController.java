package com.cocktail_web.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	// 임시 유저 리스트
	private List<User> users = new ArrayList<>();
	
	// post 방식
	@PostMapping("/createUser")
	public String createUser(Model model, User user) {
		
		// 유저 리스트에 담기
		users.add(user);
		
		model.addAttribute("userId", user.getUserId());
		
//		return "successRegister";
		return "redirect:/userList";
	}
	
	@GetMapping("/userList")
	public String userList(Model model) {
		model.addAttribute("users", users);
		
		return "userList";
	}
	
	// get 방식
	// form에서 넘긴 name 값으로 매핑된다.
	@GetMapping("/create")
	public String create(Model model, String userId, String userPassword, String userEmail) {
		
		model.addAttribute("userId", userId);
		
		return "successRegister";
	}
}
