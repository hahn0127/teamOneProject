package ksmart39.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	//사원등록
	@GetMapping("/logout")
	public String humanResourcesEnroll(Model model) {
		 model.addAttribute("title", "인사관리-사원등록");
		return"humanResources/humanResourcesEnroll";	
	}



}
