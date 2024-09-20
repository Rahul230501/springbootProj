package com.resume.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.resume.api.LatexOnlineConverter;
import com.resume.resumetemplate.TemplateA;
import com.resume.resumetemplate.TemplateB;
import com.resume.user.Education;
import com.resume.user.Experience;
import com.resume.user.Project;
import com.resume.user.User;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ResumeController {

	   @GetMapping("/home")
	    public String showHomePage(Model model) {
	        User user = new User();
	        
	        user.getProjects().add(new Project());
	        model.addAttribute("user", user);

	        user.getEducation().add(new Education());
	        model.addAttribute("user", user);
	        
	        user.getExperience().add(new Experience());
	        model.addAttribute("user", user);
	        
	        return "home";  
	    }
	
	

	@PostMapping("/submit")
	public String formController(@ModelAttribute User user,Model model) {
//		model.addAttribute("user",user);
		TemplateA temp = new TemplateA();
//		TemplateB temp = new TemplateB();
		String latexCode = temp.tempA(user);
//		temp.tempB(user);
		
		model.addAttribute("latexCode",latexCode);
		
		


		return "success";
	}

	
	
	
	

}
