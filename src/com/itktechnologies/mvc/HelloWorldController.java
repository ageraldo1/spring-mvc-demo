package com.itktechnologies.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormToUpperCase")
	public String toUpperCase(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("studentName");
		
		model.addAttribute("message", studentName.toUpperCase());
		
		return "helloworld";
	}

}
