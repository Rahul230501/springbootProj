package com.resume.user;

import java.util.List;

public class Skill {
	
	private String language;
	private String developerTools;
	private String technologies;
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDeveloperTools() {
		return developerTools;
	}
	public void setDeveloperTools(String developerTools) {
		this.developerTools = developerTools;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	@Override
	public String toString() {
		return "Skill [language=" + language + ", developerTools=" + developerTools + ", technologies=" + technologies
				+ "]";
	}
	
	

}
