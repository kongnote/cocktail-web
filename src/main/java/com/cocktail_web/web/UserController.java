package com.cocktail_web.web;

//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cocktail_web.domain.User;
//import com.cocktail_web.domain.UserRepository;

@Controller
public class UserController {
	
	// 임시 유저 리스트
	//private List<User> users = new ArrayList<>();
	
//	@Autowired
//	private UserRepository userRepository;
	
	// post 방식
//	@PostMapping("/createUser")
//	public String createUser(Model model, User user) {
//		
//		// 유저 리스트에 담기
//		//users.add(user);
////		userRepository.save(user);
//		model.addAttribute("userId", user.getUserId());
//		
////		return "successRegister";
//		return "redirect:/userList";
//	}
//	
//	@GetMapping("/userList")
//	public String userList(Model model) {
////		List<User> users = userRepository.findAll();
////		model.addAttribute("users", users);
//		
//		return "userList";
//	}
//	
//	@GetMapping("/{id}/form")
//	public String updateForm(@PathVariable Long id, Model model) {
////		Optional<User> user = userRepository.findById(id);
////		model.addAttribute("user", user);
//		return "/user/updateForm";
//	}
//	
//	@PostMapping("/{id}")
//	public String update(@PathVariable Long id, User newUser) {
//		//User user = userRepository.findOne(id);
//		//user.update(newUser);
//		//userRepository.save(user);
//		return "";
//	}
//	
//	// get 방식
//	// form에서 넘긴 name 값으로 매핑된다.
//	@GetMapping("/create")
//	public String create(Model model, String userId, String userPassword, String userEmail) {
//		
//		model.addAttribute("userId", userId);
//		
//		return "successRegister";
//	}
}
