package com.resumeBuilder.template;

import org.springframework.stereotype.Component;
import com.resumeBuilder.model.User;
import com.resumeBuilder.model.Education;
import com.resumeBuilder.model.Experience;
import com.resumeBuilder.model.Project;
import java.util.List;

@Component
public class TemplateA implements ResumeTemplate {
    
    @Override
    public String generate(User user) {
        StringBuilder latex = new StringBuilder();
        
        // Add preamble
        latex.append(getPreamble());
        
        // Add header
        latex.append(getHeader(user));
        
        // Add about section
        latex.append(getAboutSection(user));
        
        // Add education section
        latex.append(getEducationSection(user));
        
        // Add project section
        latex.append(getProjectSection(user));
        
        // Add experience section
        latex.append(getExperienceSection(user));
        
        // Add skills section
        latex.append(getSkillsSection(user));
        
        // Close document
        latex.append("\\end{document}");
        
        return latex.toString();
    }
    
    private String getPreamble() {
        return "\\documentclass[11pt]{article} %templateA\n" +
               "\\usepackage[T1]{fontenc}\n" +
               "\\usepackage{inter} \n" +
               "\\renewcommand*\\familydefault{\\sfdefault}\n" +
               "\n" +
               "\\usepackage{geometry}\n" +
               "\\geometry{\n" +
               "    a4paper,\n" +
               "    top=1.8cm,\n" +
               "    bottom=1in,\n" +
               "    left=2.5cm,\n" +
               "    right=2.5cm\n" +
               "}\n" +
               "\n" +
               "\\setcounter{secnumdepth}{0} % remove section numbering\n" +
               "\\pdfgentounicode=1 % make ATS friendly\n" +
               "\n" +
               "\\usepackage{enumitem}\n" +
               "\\setlist[itemize]{\n" +
               "    noitemsep,\n" +
               "    left=2em\n" +
               "}\n" +
               "\\setlist[description]{itemsep=0pt}\n" +
               "\\setlist[enumerate]{align=left}\n" +
               "\\usepackage[dvipsnames]{xcolor}\n" +
               "\\colorlet{icnclr}{gray}\n" +
               "\\usepackage{titlesec}\n" +
               "\\titlespacing{\\subsection}{0pt}{*0}{*0}\n" +
               "\\titlespacing{\\subsubsection}{0pt}{*0}{*0}\n" +
               "\\titleformat{\\section}{\\color{Sepia}\\large\\fontseries{black}\\selectfont\\uppercase}{}{}{\\ruleafter}[\\global\\RemVStrue]\n" +
               "\\titleformat{\\subsection}{\\fontseries{bold}\\selectfont}{}{}{\\rvs}\n" +
               "\\titleformat{\\subsubsection}{\\color{gray}\\fontseries{bold}\\selectfont}{}{}{}\n" +
               "\n" +
               "\\usepackage{xhfill} \n" +
               "\\newcommand\\ruleafter[1]{#1~\\xrfill[.5ex]{1pt}[gray]} % add rule after title in .5 x-height \n" +
               "\n" +
               "\\newif\\ifRemVS % remove vspace between \\section & \\subsection\n" +
               "\\newcommand{\\rvs}{\n" +
               "    \\ifRemVS\n" +
               "        \\vspace{-1.5ex}\n" +
               "    \\fi\n" +
               "    \\global\\RemVSfalse\n" +
               "}\n" +
               "\n" +
               "\\usepackage{fontawesome5}\n" +
               "\n" +
               "\\usepackage[bookmarks=false]{hyperref} % [imp!]\n" +
               "\\hypersetup{ \n" +
               "    colorlinks=true,\n" +
               "    urlcolor=Sepia,\n" +
               "    pdftitle={My Resume},\n" +
               "}\n" +
               "\n" +
               "\\usepackage[page]{totalcount}\n" +
               "\\usepackage{fancyhdr}\n" +
               "\\pagestyle{fancy}\n" +
               "\\renewcommand{\\headrulewidth}{0pt}\t\n" +
               "\\fancyhf{}\n" +
               "\n" +
               "\\usepackage{amsmath}\n" +
               "\\usepackage{amsfonts}\n" +
               "\n" +
               "\\begin{document}\n\n";
    }
    
    private String getHeader(User user) {
    	
        String location = user.getAddress().getCity() + "," + user.getAddress().getState();
        
        return "%== HEADER ==%\n" +
               "\\begin{center}\n" +
               "    {\\fontsize{28}{28}\\selectfont " + user.getName() + "} \\\\ \\bigskip\n" +
               "    {\\color{gray}\\faMapMarker} " + location + " \\quad \n" +
               "    {\\color{gray}\\faEnvelope[regular]} \\href{mailto:" + user.getEmail() + 
               "}{" + user.getEmail() + "} \\quad\n" +
               "    {\\color{gray}\\faIcon{mobile-alt}} \\href{tel:+91" + user.getPhone() + 
               "}{+91 " + user.getPhone() + "} \n" +
               (user.getLinkedin() != null && !user.getLinkedin().isEmpty() ? 
               "    {\\color{gray}\\faLinkedinIn} \\href{" + user.getLinkedin() + 
               "}{" + user.getLinkedin() + "}\n" : "") +
               "\\end{center}\n" +
               "%==============\n" +
               "%==============\n" +
               "%==============\n";
    }
    
    private String getAboutSection(User user) {
        if (user.getAbout() == null || user.getAbout().isEmpty()) {
            return "";
        }
        
        return "\\section{About me}\n" +
               "%==============\n" +
               "%==============\n" +
               "{" + user.getAbout() + "}\n" +
               "%==============\n" +
               "%==============\n";
    }
    
    private String getEducationSection(User user) {
        StringBuilder educationSection = new StringBuilder();
        educationSection.append("\\section{Education}\n");
        
        List<Education> educations = user.getEducation();
        if (educations == null || educations.isEmpty()) {
            return educationSection.toString();
        }
        
        for (Education e : educations) {
            String degree = e.getDegree();
            String university = e.getInstitution();
//            String universityLocation = e.getAddress().getCity() + "," + e.getAddress().getState();
            String grade = e.getGrade();
            String date = e.getDate().getStartDate() + "-" + e.getDate().getEndDate();
            
            educationSection.append("%==============\n")
                          .append("%==============\n")
                          .append("%==============\n")
                          .append("%==============\n")
                          .append("\\subsection{{").append(degree).append("}\\hfill \\normalfont {").append(date).append("}}  \n")
                          .append("\n")
                          .append("\\subsubsection{").append(university).append("},{")
                          .append("\\begin{itemize}\n")
                          .append("    \\item[\\checkmark] \\textit{Grade/GPA}:{").append(grade).append("}\n")
                          .append("\\end{itemize}\n")
                          .append("%==============\n")
                          .append("%==============\n");
        }
        
        return educationSection.toString();
    }
    
    private String getProjectSection(User user) {
        StringBuilder projectSection = new StringBuilder();
        projectSection.append("\\section{Projects}\n");
        
        List<Project> projects = user.getProjects();
        if (projects == null || projects.isEmpty()) {
            return projectSection.toString();
        }
        
        for (Project p : projects) {
            String projectTitle = p.getTitle();
            String projectDate = p.getDate().getStartDate() + "-" + p.getDate().getEndDate();
            String[] projectDetails = p.getDescription().split("\\.");
            
            projectSection.append("%==============\n")
                        .append("%==============\n")
                        .append("\\subsection{").append(projectTitle).append("} % This could be a short version of your master's thesis title\n")
                        .append("\\begin{itemize}\n");
            
            for (String pj : projectDetails) {
                if (!pj.trim().isEmpty()) {
                    projectSection.append(" \\item[\\checkmark] {").append(pj.trim()).append("} \n");
                }
            }
            
            projectSection.append("\\end{itemize}\n")
                        .append("%==============\n")
                        .append("%==============\n")
                        .append("%==============\n");
        }
        
        return projectSection.toString();
    }
    
    private String getExperienceSection(User user) {
        StringBuilder experienceSection = new StringBuilder();
        experienceSection.append("\\section{Work Experience}\n");
        
        List<Experience> experiences = user.getExperience();
        if (experiences == null || experiences.isEmpty()) {
            return experienceSection.toString();
        }
        
        for (Experience ex : experiences) {
            String company = ex.getCompany();
            String role = ex.getPosition();
            String duration = ex.getDate().getStartDate() + "-" + ex.getDate().getEndDate();
            String mode = ex.getJobMode();
            
            experienceSection.append("%==============\n")
                            .append("%==============\n")
                            .append("%==============\n")
                            .append("\\subsection{{").append(role).append("} \\hfill {\\normalfont {").append(duration).append("}}} % Insert job title and year range\n")
                            .append("\n")
                            .append("\\subsubsection{{").append(company).append("}, {").append(mode).append("}}\n")
                            .append("%==============\n");
        }
        
        return experienceSection.toString();
    }
    
    private String getSkillsSection(User user) {
        if (user.getSkill() == null) {
            return "";
        }
        
        return "\\section{Skills}\n" +
               "%==============\n" +
               "%==============\n" +
               "\\begin{itemize}\n" +
               "    \\item[\\checkmark] {\\textbf{Languages:}} {" + user.getSkill().getLanguages() + "}\n" +
               "    \\item[\\checkmark] {\\textbf{Frameworks:}} {" + user.getSkill().getFrameworks() + "}\n" +
               "    \\item[\\checkmark] {\\textbf{Developer Tools:}} {" + user.getSkill().getTools() + "}\n" +
               "    \\item[\\checkmark] {\\textbf{Technologies:}} {" + user.getSkill().getTechnologies() + "}\n" +
               "\\end{itemize}\n\n";
    }
}