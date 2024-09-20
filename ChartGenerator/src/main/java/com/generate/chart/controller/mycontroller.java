package com.generate.chart.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.generate.chart.entity.Data;
import com.generate.chart.entity.Detail;

@Controller
public class mycontroller {

	
	
	@PostMapping("/addData")
	public String AddData(@ModelAttribute Data data,@ModelAttribute Detail detail, Model model) {
	    // Assuming data.getCategories() and data.getValues() return comma-separated strings
	    String[] categories = data.getCategories().split(",");
	    String[] values = data.getValue().split(",");
	    
	    System.out.println("Categories: " + Arrays.toString(categories));
	    System.out.println("Values: " + Arrays.toString(values));
	    System.out.println(detail.getTitle());
	    
	    model.addAttribute("title", detail.getTitle());
	    model.addAttribute("subtitle",detail.getSubtitle());
	    model.addAttribute("xAxis", detail.getxAsix());
	    model.addAttribute("yAxis", detail.getyAsix());
	    model.addAttribute("categories", categories);
	    model.addAttribute("values", values);
	    
	   

	    return "graph";  // Returns the Thymeleaf view
	}

	
}
