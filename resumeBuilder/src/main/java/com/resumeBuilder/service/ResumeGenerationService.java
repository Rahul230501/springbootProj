package com.resumeBuilder.service;

import com.resumeBuilder.model.User;
import com.resumeBuilder.template.ResumeTemplate;
import com.resumeBuilder.template.TemplateA;
import com.resumeBuilder.template.TemplateB;
import com.resumeBuilder.template.TemplateC;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ResumeGenerationService {

    private final TemplateA templateA;
    private final TemplateB templateB;
    private final TemplateC templateC;
	
	 private final Map<String, ResumeTemplate> templates;
	    
	    public ResumeGenerationService(List<ResumeTemplate> templateServices, TemplateA templateA) {
	        this.templateB = new TemplateB();
			this.templateC = new TemplateC();
			this.templates = new HashMap<>();
	        templateServices.forEach(service -> 
	            templates.put(service.getClass().getSimpleName().replace("Template", ""), service)
	        );
	        this.templateA = templateA;
	    }
	    
	    public String generateResume(User user, String templateName) {
	        ResumeTemplate template = templates.get(templateName);
	        if (template == null) {
	            throw new IllegalArgumentException("Invalid template selected");
	        }
	        return template.generate(user);
	    }
	    
	    public List<String> getAvailableTemplates() {
	        return List.copyOf(templates.keySet());
	    }
    
    public String generateLatexResume(User user,String template) {
        // Implement your LaTeX generation logic here
    	if(template.equals("TemplateA")) {
    		return templateA.generate(user);
    	}
    	else if(template.equals("TemplateB")) {
    		return templateB.generate(user);
    	}
    	else {
    		return templateC.generate(user);
     	}
        // Similar to your TemplateA implementation
        
    }
}