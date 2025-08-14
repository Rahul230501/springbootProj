package com.resumeBuilder.controller;

import com.resumeBuilder.model.Education;
import com.resumeBuilder.model.Experience;
import com.resumeBuilder.model.Project;
import com.resumeBuilder.model.User;
import com.resumeBuilder.service.ResumeGenerationService;

import com.resumeBuilder.service.UserService;

import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@Controller
@RequestMapping("/resume")
public class ResumeController {
    
    private final ResumeGenerationService resumeService;
    private final UserService userService;
    
    public ResumeController(ResumeGenerationService resumeService, UserService userService) {
        this.resumeService = resumeService;
        this.userService = userService;
    }
    
    @GetMapping
    public String showResumeForm(@AuthenticationPrincipal UserDetails userDetails, Model model) {
        User user = userService.findByUsername(userDetails.getUsername());
        
        // Initialize empty collections if null
        if (user.getEducation() == null || user.getEducation().isEmpty()) {
            user.setEducation(new ArrayList<>());
            user.addEducation(new Education());
        }
        
        if (user.getExperience() == null || user.getExperience().isEmpty()) {
            user.setExperience(new ArrayList<>());
            user.addExperience(new Experience());
        }
        
        if (user.getProjects() == null || user.getProjects().isEmpty()) {
            user.setProjects(new ArrayList<>());
            user.addProject(new Project());
        }
        
        model.addAttribute("user", user);
        return "resume-form";
    }
    
    @PostMapping("/generate")
    public String generateResume(@AuthenticationPrincipal UserDetails userDetails, User userData, Model model,@RequestParam("template")String template) {
        User user = userService.findByUsername(userDetails.getUsername());
        // Update user data
        user.setName(userData.getName());
        user.setEmail(userData.getEmail());
        user.setPhone(userData.getPhone());
        user.setLinkedin(userData.getLinkedin());
        user.setAbout(userData.getAbout());
        user.setAddress(userData.getAddress());
        user.setEducation(userData.getEducation());
        user.setExperience(userData.getExperience());
        user.setProjects(userData.getProjects());
        user.setSkill(userData.getSkill());
        // Update other fields as needed
        System.out.println(template);
        String latexContent = resumeService.generateLatexResume(user,template);
        model.addAttribute("latexContent", latexContent);
        return "resume-preview";
    }
}