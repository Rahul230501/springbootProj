package com.resume.resumetemplate;

import com.resume.user.User;

public class TemplateB {

	public void tempB(User user)
	{
		String template = 
				"%-------------------------\n" +
				"% Resume in Latex\n" +
				"% Author: Abey George\n" +
				"% Based off of: https://github.com/sb2nov/resume\n" +
				"% License: MIT\n" +
				"%-------------------------\n" +
				"\n" +
				"\\documentclass[resume,11pt]{article}\n" +
				"\n" +
				"\\usepackage{latexsym}\n" +
				"\\usepackage[empty]{fullpage}\n" +
				"\\usepackage{titlesec}\n" +
				"\\usepackage{marvosym}\n" +
				"\\usepackage[usenames,dvipsnames]{color}\n" +
				"\\usepackage{verbatim}\n" +
				"\\usepackage{enumitem}\n" +
				"\\usepackage[hidelinks]{hyperref}\n" +
				"\\usepackage[english]{babel}\n" +
				"\\usepackage{tabularx}\n" +
				"\\usepackage{multicol}\n" +
				"\\usepackage{graphicx}\n" +
				"\\usepackage{lmodern} % Using Latin Modern font\n" +
				"\\setlength{\\multicolsep}{-3.0pt}\n" +
				"\\setlength{\\columnsep}{-1pt}\n" +
				"\\input{glyphtounicode}\n" +
				"\n" +
				"\\RequirePackage{tikz}\n" +
				"\\RequirePackage{xcolor}\n" +
				"\\RequirePackage{fontawesome}\n" +
				"\\usepackage{tikz}\n" +
				"\\usetikzlibrary{svg.path}\n" +
				"\n" +
				"\\definecolor{cvblue}{HTML}{0E5484}\n" +
				"\\definecolor{black}{HTML}{130810}\n" +
				"\\definecolor{darkcolor}{HTML}{0F4539}\n" +
				"\\definecolor{cvgreen}{HTML}{3BD80D}\n" +
				"\\definecolor{taggreen}{HTML}{00E278}\n" +
				"\\definecolor{SlateGrey}{HTML}{2E2E2E}\n" +
				"\\definecolor{LightGrey}{HTML}{666666}\n" +
				"\\colorlet{name}{black}\n" +
				"\\colorlet{tagline}{darkcolor}\n" +
				"\\colorlet{heading}{darkcolor}\n" +
				"\\colorlet{headingrule}{cvblue}\n" +
				"\\colorlet{accent}{darkcolor}\n" +
				"\\colorlet{emphasis}{SlateGrey}\n" +
				"\\colorlet{body}{LightGrey}\n" +
				"\n" +
				"% Adjust margins\n" +
				"\\addtolength{\\oddsidemargin}{-0.6in}\n" +
				"\\addtolength{\\evensidemargin}{-0.5in}\n" +
				"\\addtolength{\\textwidth}{1.19in}\n" +
				"\\addtolength{\\topmargin}{-0.7in}\n" +
				"\\addtolength{\\textheight}{1.4in}\n" +
				"\n" +
				"\\urlstyle{same}\n" +
				"\n" +
				"\\raggedbottom\n" +
				"\\raggedright\n" +
				"\\setlength{\\tabcolsep}{0in}\n" +
				"\n" +
				"% Sections formatting\n" +
				"\\titleformat{\\section}{\n" +
				"  \\vspace{-4pt}\\scshape\\raggedright\\large\\bfseries\n" +
				"}{}{0em}{}[\\color{black}\\titlerule \\vspace{-5pt}]\n" +
				"\n" +
				"% Ensure that generated PDF is machine readable/ATS parsable\n" +
				"\\pdfgentounicode=1\n" +
				"\n" +
				"% Custom commands\n" +
				"\\newcommand{\\resumeItem}[1]{\\item\\small{#1 \\vspace{-2pt}}}\n" +
				"\n" +
				"\\newcommand{\\resumeSubheading}[4]{\n" +
				"  \\vspace{-2pt}\\item\n" +
				"    \\begin{tabular*}{1.0\\textwidth}[t]{l@{\\extracolsep{\\fill}}r}\n" +
				"      \\textbf{\\large#1} & \\textbf{\\small #2} \\\\\n" +
				"      \\textit{\\large#3} & \\textit{\\small #4} \\\\\n" +
				"    \\end{tabular*}\\vspace{-7pt}\n" +
				"}\n" +
				"\n" +
				"\\newcommand{\\resumeProjectHeading}[2]{\n" +
				"    \\item\n" +
				"    \\begin{tabular*}{1.001\\textwidth}{l@{\\extracolsep{\\fill}}r}\n" +
				"      \\small#1 & \\textbf{\\small #2}\\\\\n" +
				"    \\end{tabular*}\\vspace{-7pt}\n" +
				"}\n" +
				"\n" +
				"\\newcommand{\\resumeSubItem}[1]{\\resumeItem{#1}\\vspace{-4pt}}\n" +
				"\n" +
				"\\renewcommand\\labelitemi{$\\vcenter{\\hbox{\\tiny$\\bullet$}}$}\n" +
				"\\renewcommand\\labelitemii{$\\vcenter{\\hbox{\\tiny$\\bullet$}}$}\n" +
				"\n" +
				"\\newcommand{\\resumeSubHeadingListStart}{\\begin{itemize}[leftmargin=0.15in, label={}]}\n" +
				"\\newcommand{\\resumeSubHeadingListEnd}{\\end{itemize}}\n" +
				"\\newcommand{\\resumeItemListStart}{\\begin{itemize}}\n" +
				"\\newcommand{\\resumeItemListEnd}{\\end{itemize}\\vspace{-5pt}}\n" +
				"\n" +
				"% Set line spacing\n" +
				"\\renewcommand{\\baselinestretch}{1.0}\n" +
				"\n" +
				"%-------------------------\n" +
				"%%%%%%  RESUME STARTS HERE  %%%%%%%%%%%%%%%%%%%%%%%%%%%%\n" +
				"\n";
//				
//		String name = user.getName();
//
//		String location = user.getAddress().getCity() + "," + user.getAddress().getState();
//
//		String phone = user.getPhone();
//
//		String email = user.getEmail();
//
//		String linkedin = user.getLinkdinId();
//				
//				
//			String heading="\\begin{document}\n" +
//				"\n" +
//				"%----------HEADING----------\n" +
//				"\\begin{center}\n" +
//				"    {\\Huge \\scshape {"+name+"}} \\\\ \\vspace{1pt}\n" +
//				"    {"+location+"}  \\\\ \\vspace{1pt}\n" +
//				"    \\small \\href{tel:+91-{"+phone+"}{\\raisebox{-0.1\\height}\\faPhone\\ \\underline{+91-{"+phone+"}} ~\n" +
//				"    \\href{mailto:{"+email+"}}{\\raisebox{-0.2\\height}\\faEnvelope\\  \\underline{\"+email+\"}} ~ \n" +
//				"    \\href{"+linkedin+"}{\\raisebox{-0.2\\height}\\faLinkedinSquare\\ \\underline{Linkedin}}  ~\n" +
//				"    \\href{https://github.com/Rahul230501}{\\raisebox{-0.2\\height}\\faGithub\\ \\underline{Rahul230501}} ~\n" +
//				"    % \\href{https://www.hackerrank.com/profile/rahulkumar_23051}{\\raisebox{-0.2\\height}\\faHackerrank\\ \\underline{rahulkumar_23051}} ~\n" +
//				"    \\href{https://leetcode.com/user6674bx/}{\\raisebox{-0.2\\height}\\faUser\\ \\underline{LeetcodeProfile}}\n" +
//				"    \\vspace{-8pt}\n" +
//				"\\end{center}\n" +
//				"\n";
//				
				
//				String education="%-----------EDUCATION-----------\n" +
//				"\\section{EDUCATION}\n" +
//				"\\resumeSubHeadingListStart\n" +
//				"\\resumeSubheading\n" +
//				"{Dronacharya Group of Institutions}{11/2021 -- 07/2025}\n" +
//				"{B.Tech - \\textbf{SGPA} - \\textbf{7.28}}{Greater Noida, India}\n" +
//				"\\resumeSubHeadingListEnd\n" +
//				"\n" +
//				"\\resumeSubHeadingListStart\n" +
//				"\\resumeSubheading\n" +
//				"{Patrachar Vidyalaya}{05/2019 -- 04/2020}\n" +
//				"{12th - \\textbf{Percent} - \\textbf{61\\%}}{New Delhi, India}\n" +
//				"\\resumeSubHeadingListEnd\n" +
//				"\n" +
//				"\\resumeSubHeadingListStart\n" +
//				"\\resumeSubheading\n" +
//				"{DAV Public School}{05/2017 -- 04/2018}\n" +
//				"{10th - \\textbf{Percent} - \\textbf{72.6\\%}}{Bihar, India}\n" +
//				"\\resumeSubHeadingListEnd\n" +
//				"\n";
//				
//				String experience="%-----------EXPERIENCE-----------\n" +
//				"\\section{EXPERIENCE}\n" +
//				"\\resumeSubHeadingListStart\n" +
//				"\\resumeSubheading\n" +
//				"{Content Writer Intern}{06/2021 -- 09/2021}\n" +
//				"{Dezinbee Technologies}{New Delhi, India}\n" +
//				"\\resumeItemListStart\n" +
//				"\\resumeItem{Worked on blog writing, creative writing, social media handling and conducting market research to improve the company's online presence.}\n" +
//				"\\resumeItemListEnd\n" +
//				"\\resumeSubHeadingListEnd\n" +
//				"\n";
//				String project="%-----------PROJECTS-----------\n" +
//				"\\section{PROJECTS}\n" +
//				"\\resumeSubHeadingListStart\n" +
//				"\\resumeProjectHeading\n" +
//				"{\\textbf{Student Management System}}{2022}\n" +
//				"\\resumeItemListStart\n" +
//				"\\resumeItem{Developed a software using Java and MySQL to manage student information, fees, grades, and attendance with proper access rights and features.}\n" +
//				"\\resumeItemListEnd\n" +
//				"\n" +
//				"\\resumeProjectHeading\n" +
//				"{\\textbf{Crypto Currency Rate Application}}{2023}\n" +
//				"\\resumeItemListStart\n" +
//				"\\resumeItem{Created an Android app that provides real-time cryptocurrency rates, with functionality for data addition, deletion, and updates using Java and XML.}\n" +
//				"\\resumeItemListEnd\n" +
//				"\\resumeSubHeadingListEnd\n" +
//				"\n";
//				String skills="%-----------TECHNICAL SKILLS-----------\n" +
//				"\\section{TECHNICAL SKILLS}\n" +
//				"\\resumeSubHeadingListStart\n" +
//				"\\resumeSubItem{\\textbf{Languages}{: Java, SQL, XML, HTML, CSS}}\n" +
//				"\\resumeSubItem{\\textbf{Tools}{: Android Studio, MS Excel, Photoshop}}\n" +
//				"\\resumeSubItem{\\textbf{Frameworks}{: Spring}}\n" +
//				"\\resumeSubHeadingListEnd\n" +
//				"\n";
////				String certificate="%-----------CERTIFICATIONS-----------\n" +
////				"\\section{CERTIFICATIONS}\n" +
////				"\\resumeSubHeadingListStart\n" +
////				"\\resumeSubItem{\\textbf{Android Development}{: Complete Android Development Certification from Udemy}}\n" +
////				"\\resumeSubHeadingListEnd\n" +
////				"\n" +
////				"%-----------ACHIEVEMENTS-----------\n" +
////				"\\section{ACHIEVEMENTS}\n" +
////				"\\resumeSubHeadingListStart\n" +
////				"\\resumeSubItem{1st Prize in Coding Contest at TechFest2023.}\n" +
////				"\\resumeSubHeadingListEnd\n" +
////				"\n" +
////				"\\end{document}\n";
		
		
		
//		// Define sections of the LaTeX template
		String preamble = "%-------------------------\n" + "% Resume in Latex\n" + "% Author: Abey George\n"
				+ "% Based off of: https://github.com/sb2nov/resume\n" + "% License: MIT\n"
				+ "%-------------------------\n" + "\n" + "\\documentclass[resume,11pt]{article}\n" + "\n"
				+ "\\usepackage{latexsym}\n" + "\\usepackage[empty]{fullpage}\n" + "\\usepackage{titlesec}\n"
				+ "\\usepackage{marvosym}\n" + "\\usepackage[usenames,dvipsnames]{color}\n" + "\\usepackage{verbatim}\n"
				+ "\\usepackage{enumitem}\n" + "\\usepackage[hidelinks]{hyperref}\n" + "\\usepackage[english]{babel}\n"
				+ "\\usepackage{tabularx}\n" + "\\usepackage{multicol}\n" + "\\usepackage{graphicx}\n"
				+ "\\usepackage{lmodern} % Using Latin Modern font\n" + "\\setlength{\\multicolsep}{-3.0pt}\n"
				+ "\\setlength{\\columnsep}{-1pt}\n" + "\\input{glyphtounicode}\n" + "\n" + "\\RequirePackage{tikz}\n"
				+ "\\RequirePackage{xcolor}\n" + "\\RequirePackage{fontawesome}\n" + "\\usepackage{tikz}\n"
				+ "\\usetikzlibrary{svg.path}\n" + "\n" + "\\definecolor{cvblue}{HTML}{0E5484}\n"
				+ "\\definecolor{black}{HTML}{130810}\n" + "\\definecolor{darkcolor}{HTML}{0F4539}\n"
				+ "\\definecolor{cvgreen}{HTML}{3BD80D}\n" + "\\definecolor{taggreen}{HTML}{00E278}\n"
				+ "\\definecolor{SlateGrey}{HTML}{2E2E2E}\n" + "\\definecolor{LightGrey}{HTML}{666666}\n"
				+ "\\colorlet{name}{black}\n" + "\\colorlet{tagline}{darkcolor}\n" + "\\colorlet{heading}{darkcolor}\n"
				+ "\\colorlet{headingrule}{cvblue}\n" + "\\colorlet{accent}{darkcolor}\n"
				+ "\\colorlet{emphasis}{SlateGrey}\n" + "\\colorlet{body}{LightGrey}\n" + "\n" + "% Adjust margins\n"
				+ "\\addtolength{\\oddsidemargin}{-0.6in}\n" + "\\addtolength{\\evensidemargin}{-0.5in}\n"
				+ "\\addtolength{\\textwidth}{1.19in}\n" + "\\addtolength{\\topmargin}{-0.7in}\n"
				+ "\\addtolength{\\textheight}{1.4in}\n" + "\n" + "\\urlstyle{same}\n" + "\n" + "\\raggedbottom\n"
				+ "\\raggedright\n" + "\\setlength{\\tabcolsep}{0in}\n" + "\n" + "% Sections formatting\n"
				+ "\\titleformat{\\section}{\n" + "  \\vspace{-4pt}\\scshape\\raggedright\\large\\bfseries\n"
				+ "}{}{0em}{}[\\color{black}\\titlerule \\vspace{-5pt}]\n" + "\n"
				+ "% Ensure that generated PDF is machine readable/ATS parsable\n" + "\\pdfgentounicode=1\n" + "\n"
				+ "% Custom commands\n" + "\\newcommand{\\resumeItem}[1]{\\item\\small{#1 \\vspace{-2pt}}}\n" + "\n"
				+ "\\newcommand{\\resumeSubheading}[4]{\n" + "  \\vspace{-2pt}\\item\n"
				+ "    \\begin{tabular*}{1.0\\textwidth}[t]{l@{\\extracolsep{\\fill}}r}\n"
				+ "      \\textbf{\\large#1} & \\textbf{\\small #2} \\\\\n"
				+ "      \\textit{\\large#3} & \\textit{\\small #4} \\\\\n" + "    \\end{tabular*}\\vspace{-7pt}\n"
				+ "}\n" + "\n" + "\\newcommand{\\resumeProjectHeading}[2]{\n" + "    \\item\n"
				+ "    \\begin{tabular*}{1.001\\textwidth}{l@{\\extracolsep{\\fill}}r}\n"
				+ "      \\small#1 & \\textbf{\\small #2}\\\\\n" + "    \\end{tabular*}\\vspace{-7pt}\n" + "}\n" + "\n"
				+ "\\newcommand{\\resumeSubItem}[1]{\\resumeItem{#1}\\vspace{-4pt}}\n" + "\n"
				+ "\\renewcommand\\labelitemi{$\\vcenter{\\hbox{\\tiny$\\bullet$}}$}\n"
				+ "\\renewcommand\\labelitemii{$\\vcenter{\\hbox{\\tiny$\\bullet$}}$}\n" + "\n"
				+ "\\newcommand{\\resumeSubHeadingListStart}{\\begin{itemize}[leftmargin=0.15in, label={}]}\n"
				+ "\\newcommand{\\resumeSubHeadingListEnd}{\\end{itemize}}\n"
				+ "\\newcommand{\\resumeItemListStart}{\\begin{itemize}}\n"
				+ "\\newcommand{\\resumeItemListEnd}{\\end{itemize}\\vspace{-5pt}}\n" + "\n" + "% Set line spacing\n"
				+ "\\renewcommand{\\baselinestretch}{1.0}\n" + "\n" + "%-------------------------\n"
				+ "%%%%%%  RESUME STARTS HERE  %%%%%%%%%%%%%%%%%%%%%%%%%%%%\n" + "\n";

		// Heading

		String name = user.getName();

		String location = user.getAddress().getCity() + " " + user.getAddress().getState();

		String phone = user.getPhone();

		String email = user.getEmail();

		String linkedin = user.getLinkdinId();

		String heading = "\\begin{document}\n\n" + "%----------HEADING----------\n" + "\\begin{center}\n"
				+ "    {\\Huge \\scshape " + name + "} \\\\ \\vspace{1pt}\n" + "    " + location
				+ "  \\\\ \\vspace{1pt}\n" + "    \\small \\href{tel:" + phone
				+ "}{\\raisebox{-0.1\\height}\\faPhone\\ \\underline{" + phone + "}} ~\n" + "    \\href{mailto:" + email
				+ "}{\\raisebox{-0.2\\height}\\faEnvelope\\  \\underline{" + email + "}} ~ \n" + "    \\href{"
				+ linkedin + "}{\\raisebox{-0.2\\height}\\faLinkedinSquare\\ \\underline{ linkedin  }}  ~\n" + "    \n"
				+ "    \\vspace{-8pt}\n" + "\\end{center}\n\n";

//		// Education
//
//		String university = user.getEducation().getCollege();
//
//		String degree = user.getEducation().getCourse();
//
//		String gpa = user.getEducation().getPercentage();
//
//		String date = formatDate(user.getEducation().getDate().getStartDate(), simpleDateFormat) + "-"
//				+ formatDate(user.getEducation().getDate().getStartDate(), simpleDateFormat);
//
//		String universityLocation = user.getEducation().getAddress().getCity() + " "
//				+ user.getEducation().getAddress().getState();
//
//		String education = "%-----------EDUCATION-----------\n" + "\\section{EDUCATION}\n"
//				+ "\\resumeSubHeadingListStart\n" + "\\resumeSubheading\n" + "{" + university + "}{" + date + "}\n"
//				+ "{" + degree + " - \\textbf{SGPA} - \\textbf{" + gpa + "}}{" + universityLocation + "}\n"
//				+ "\\resumeSubHeadingListEnd\n\n";
//
//		// Projects
//		String projectTitle = user.getProject().getTitle();
//
//		String projectDate = formatDate(user.getProject().getDate().getStartDate(), simpleDateFormat) + "-"
//				+ formatDate(user.getProject().getDate().getStartDate(), simpleDateFormat);
//
//		String projectDetails = user.getProject().getDesc();
//
//		String projects = "%-----------PROJECTS-----------\n" + "\\section{PROJECTS}\n" + "\\vspace{-5pt}\n"
//				+ "\\resumeSubHeadingListStart\n" + "\\resumeProjectHeading\n" + "{\\textbf{" + projectTitle + " :}}{"
//				+ projectDate + "}\n" + "\\vspace{-5pt}\n" + "\\resumeItemListStart\n" + projectDetails
//				+ "\\resumeItemListEnd\n\n";
//
//		// Internship
//
//		String internshipCompany = user.getExperience().getCompanyName();
//
//		String internshipRole = user.getExperience().getJobTitle();
//
//		String internshipDuration = formatDate(user.getExperience().getDate().getStartDate(), simpleDateFormat) + "-"
//				+ formatDate(user.getExperience().getDate().getEndDate(), simpleDateFormat);
//
//		String internshipMode = user.getExperience().getJobMode();
//
//		String internship = "%-----------INTERNSHIP-----------\n" + "\\section{INTERNSHIP}\n"
//				+ "\\resumeSubHeadingListStart\n" + "\\resumeSubheading\n" + "{" + internshipCompany + "}{"
//				+ internshipDuration + "}\n" + "{" + internshipRole + "}{" + internshipMode + "}\n"
//				+ "\\resumeItemListStart\n" + "\\resumeItemListEnd\n\n";

		// Technical Skills
		String languages = user.getSkill().getLanguage();

		String tools = user.getSkill().getDeveloperTools();

		String technologies = user.getSkill().getTechnologies();

		String technicalSkills = "%-----------TECHNICAL SKILLS-----------\n" + "\\section{TECHNICAL SKILLS}\n"
				+ "\\begin{itemize}[leftmargin=0.15in, label={}]\n" + "\\small{\n" + "  \\item \\textbf{Languages:} "
				+ languages + "\n" + "  \\item \\textbf{Developer Tools:} " + tools + "\n"
				+ "  \\item \\textbf{Technologies/Frameworks:} " + technologies + "\n" + "}\n" + "\\end{itemize}\n\n";

//		// Certifications
//		System.out.println(
//				"Enter the certification name and URL (format: Certification Name - URL, separate each with ','):");
//		String certifications = scanner.nextLine();
//
//		String[] certificationsArray = certifications.split(",");
//
//		StringBuilder certificationsBuilder = new StringBuilder();
//		for (String cert : certificationsArray) {
//			String[] parts = cert.split(" - ");
//			if (parts.length == 2) {
//				certificationsBuilder.append("\\item \\href{").append(parts[1].trim()).append("}{")
//						.append(parts[0].trim()).append("}\n");
//			}
//		}
//
//		String certificationsSection = "%-----------CERTIFICATIONS-----------\n" + "\\section{CERTIFICATIONS}\n"
//				+ "\\begin{itemize}[leftmargin=0.15in, label={}]\n" + "\\small{\n" + certificationsBuilder.toString()
//				+ "}\n" + "\\end{itemize}\n";

		// Combine all sections
//		String resume = preamble + heading + education + projects + internship + technicalSkills + "\\end{document}";
//
//		// Print resume to console (or save to a file if needed)
//		m.addAttribute("msg",resume);
//		
//		System.out.println("Generated LaTeX Resume:\n");
//		System.out.println(resume);
				
//				String resume = template+heading+education+experience+project+skills;
//				System.out.println(resume);

	}
}
