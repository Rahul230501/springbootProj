package com.resume.resumetemplate;

import java.util.List;

import com.resume.user.Education;
import com.resume.user.Experience;
import com.resume.user.Project;
import com.resume.user.User;

public class TemplateA {
	
	public String  tempA(User user) {
		
		
		String template =
	            "\\documentclass[11pt]{article}\n" +
	                    "\n" +
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
	                    "\\begin{document}\n" +
	                    "\n";
		
		
		
		String name = user.getName();

		String location = user.getAddress().getCity() + "," + user.getAddress().getState();

		String phone = user.getPhone();

		String email = user.getEmail();

		String linkedin = user.getLinkdinId();
		
	            String  header ="%== HEADER ==%\n" +
	                    "\\begin{center}      \n" +
	                    "    {\\fontsize{28}{28}\\selectfont "+name+"} \\\\ \\bigskip\n" +
	                    "\n" +
	                    "    {\\color{icnclr}\\faMapMarker} "+location+" \\quad \n" +
	                    "    {\\color{icnclr}\\faEnvelope[regular]} \\href{mailto:"+email+"}{"+email+"} \\quad\n" +
	                    "    {\\color{icnclr}\\faIcon{mobile-alt}} \\href{tel:+91"+phone+"}{+91 {"+phone+"}} \n" +
	                    "    % You can also put your LinkedIn or website address\n" +
	                    "   % {\\color{icnclr}\\faLinkedinIn} \\href{"+linkedin+"}{"+linkedin+"}\n" +
	                    "\\end{center}\n" +
	                    "%==============\n" +
	                    "%==============\n" +
	                    "%==============\n" ;
	            
	            String aboutme = user.getAbout();
	            
	              String about="\\section{About me}\n" +
	                    "%==============\n" +
	                    "%==============\n" +
	                    "{"+aboutme+"}\n" +
	                    "%==============\n" +
	                    "%==============\n";
	              
	              
	              String education   =  "\\section{Education}\n" ;
                   
	              
	                List<Education> educations  = user.getEducation();
	                
	                for(Education e : educations) {
	                	String degree  = e.getCourse();
	                	String university = e.getCollege();
	                	String universityLocation = e.getAddress().getCity()+","+e.getAddress().getState();
	                	String percent = e.getPercentage();
	                	String date = e.getDate().getStartDateYear()+"-"+e.getDate().getEndDateYear();
	                	
	                	String edu =  "%==============\n" +
        	                    "%==============\n" +
        	                    "%==============\n" +
        	                    "%==============\n" +
        	                    "\\subsection{{"+degree+"}\\hfill \\normalfont {"+date+"}}  \n" +
        	                    "\n" +
        	                    "\\subsubsection{{"+university+"},{"+universityLocation+"}}\n" +
        	                    "\\begin{itemize}\n" +
        	                    "    \\item[\\checkmark] \\textit{Percentage}:{"+percent+"\\%}\n" +
        	                    "    \\end{itemize}\n" +
        	                    "%==============\n" +
        	                    "%==============\n";
        	            		
        	            		education = education+edu;
	                }
	                
	                

	              
	              String project = "\\section{Projects}\n" ;
	              for(Project p:user.getProjects()){
	            	  
	            	  String projectTitle = p.getTitle();
	                   
                 		String projectDate = p.getDate().getStartDateYear() + "-"
                 				+p.getDate().getEndDateYear();
                 		
                 
                 		String projectDetails[] = p.getDesc().split("\\.");
                 
                        



              
               String projStart=   "%==============\n" +
                  "%==============\n" +
                  "\\subsection{"+projectTitle+"} % This could be a short version of your master's thesis title\n" +
                  "\\begin{itemize}\n";
               
               String  projMid = "";
                   for(String pj : projectDetails) {
               
                	   projMid = projMid +  " \\item[\\checkmark] {"+pj+"} \n" ;
                   }
                 
             String projEnd= "\\end{itemize}\n" +
                  "%==============\n" +
                  "%==============\n" +
                  "%==============\n";
             String proj = projStart+projMid+projEnd;
             
              
              project = project +proj;
	            	  
	              };
	                    



	              
	              
	              String experience = "\\section{Work Experience}\n" ; 
	                 
	                
	                 for(Experience ex :user.getExperience()){
	                		String internshipCompany = ex.getCompanyName();
			                
	                		String internshipRole = ex.getJobTitle();
	                
	                		String internshipDuration =ex.getDate().getStartDateYear()
	                				+"-"
	                				+ ex.getDate().getEndDateYear();
	                
	                		String internshipMode = ex.getJobMode();



             String exp =       
                    "%==============\n" +
                    "%==============\n" +
                    "%==============\n" +
                    "\\subsection{{"+internshipRole+"} \\hfill {\\normalfont {"+internshipDuration+"}}} % Insert job title and year range\n" +
                    "\n" +
                    "\\subsubsection{{"+internshipCompany+"}, {"+internshipMode+"}}\n" +
//                    "\\begin{itemize}\n" +
//                    "    \\item[\\checkmark] {\\textbf{Action-Oriented Bullet Point:}} Your achievement (quantified, where possible).\n" +
//                    "    \\item[\\checkmark] {\\textbf{Action-Oriented Bullet Point:}} Your achievement (quantified, where possible).\n" +
//                    "\\end{itemize}\n" +
//                    "%==============\n" +
                    "%==============\n";
             
                   experience = experience +exp;
             

	                 };
		                
	             
	     		String languages = user.getSkill().getLanguage();
	             
	             		String tools = user.getSkill().getDeveloperTools();
	             
	             		String technologies = user.getSkill().getTechnologies();
	                    
	                    
	                    
	                  String skill =  "\\section{Skills}\n" +
	                    "%==============\n" +
	                    "%==============\n" +
	                    "\\begin{itemize}\n" +
	                    "    \\item[\\checkmark] {\\textbf{Languages:}} {"+languages+"}\n" +
	                    "    \\item[\\checkmark] {\\textbf{Developer Tools:}} {"+tools+"}\n" +
	                    "    \\item[\\checkmark] {\\textbf{Technologies/Frameworks:}} {"+technologies+"}\n" +
	                    "\\end{itemize}\n" +
	                    "\n" +
	                    "\\end{document}\n";


	             String finaldoc = template+header+about+education+project+experience+skill;
	             
	             return finaldoc;
	             
	}
	

	
	

}
