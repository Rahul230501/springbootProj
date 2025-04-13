package com.resumeBuilder.template;

import java.util.List;

import com.resumeBuilder.model.Education;
import com.resumeBuilder.model.Experience;
import com.resumeBuilder.model.Project;
import com.resumeBuilder.model.User;



public class TemplateB implements ResumeTemplate {
    
    public String generate(User user) {
        
        String template =
            "\\documentclass[10pt, letterpaper]{article} %templateB\n" +
            "\n" +
            "% Packages\n" +
            "\\usepackage[\n" +
            "    ignoreheadfoot,\n" +
            "    top=2 cm,\n" +
            "    bottom=2 cm,\n" +
            "    left=2 cm,\n" +
            "    right=2 cm,\n" +
            "    footskip=1.0 cm,\n" +
            "]{geometry}\n" +
            "\\usepackage[explicit]{titlesec}\n" +
            "\\usepackage{tabularx}\n" +
            "\\usepackage{array}\n" +
            "\\usepackage[dvipsnames]{xcolor}\n" +
            "\\definecolor{primaryColor}{RGB}{0, 79, 144}\n" +
            "\\usepackage{enumitem}\n" +
            "\\usepackage{fontawesome5}\n" +
            "\\usepackage{amsmath}\n" +
            "\\usepackage[\n" +
            "    pdftitle={" + user.getName() + "'s CV},\n" +
            "    pdfauthor={" + user.getName() + "},\n" +
            "    colorlinks=true,\n" +
            "    urlcolor=primaryColor\n" +
            "]{hyperref}\n" +
            "\\usepackage[pscoord]{eso-pic} \n"+
            "\\usepackage{calc} "+
            "\\usepackage{bookmark} "+
            "\\usepackage{lastpage} "+
            "\\usepackage{changepage}"+ 
            "\\usepackage{paracol}"+ 
            "\\usepackage{ifthen} "+
            "\\usepackage{needspace} "+
            "\\usepackage{iftex} "+
            "\\usepackage[default, type1]{sourcesanspro}\n" +
            "\n" +
            "% Settings\n" +
            "\\pagestyle{empty}\n" +
            "\\setcounter{secnumdepth}{0}\n" +
            "\\setlength{\\parindent}{0pt}\n" +
            "\\setlength{\\topskip}{0pt}\n" +
            "\\setlength{\\columnsep}{0.15cm}\n" +
            "\n" +
            "% Section formatting\n" +
            "\\titleformat{\\section}{\n" +
            "    \\Large\\color{primaryColor}\n" +
            "}{\n" +
            "}{\n" +
            "}{\n" +
            "    \\textbf{#1}\\hspace{0.15cm}\\titlerule[0.8pt]\\hspace{-0.1cm}\n" +
            "}[]\n" +
            "\n" +
            "\\titlespacing{\\section}{\n" +
            "    -1pt\n" +
            "}{\n" +
            "    0.3 cm\n" +
            "}{\n" +
            "    0.2 cm\n" +
            "}\n" +
            "\n" +
            "% Custom environments\n" +
            "\\newenvironment{highlights}{\n" +
            "    \\begin{itemize}[\n" +
            "        topsep=0.10 cm,\n" +
            "        parsep=0.10 cm,\n" +
            "        partopsep=0pt,\n" +
            "        itemsep=0pt,\n" +
            "        leftmargin=0.4 cm + 10pt\n" +
            "    ]\n" +
            "}{\n" +
            "    \\end{itemize}\n" +
            "}\n" +
            "\n" +
            "\\newenvironment{onecolentry}{\n" +
            "    \\begin{adjustwidth}{\n" +
            "        0.2 cm + 0.00001 cm\n" +
            "    }{\n" +
            "        0.2 cm + 0.00001 cm\n" +
            "    }\n" +
            "}{\n" +
            "    \\end{adjustwidth}\n" +
            "}\n" +
            "\n" +
            "\\newenvironment{twocolentry}[2][]{\n" +
            "    \\onecolentry\n" +
            "    \\def\\secondColumn{#2}\n" +
            "    \\setcolumnwidth{\\fill, 4.5 cm}\n" +
            "    \\begin{paracol}{2}\n" +
            "}{\n" +
            "    \\switchcolumn \\raggedleft \\secondColumn\n" +
            "    \\end{paracol}\n" +
            "    \\endonecolentry\n" +
            "}\n" +
            "\n" +
            "\\begin{document}\n" +
            "\n" +
            "% Header with contact information\n" +
            "\\begin{center}\n" +
            "    {\\fontsize{30 pt}{30 pt}\\textbf{" + user.getName() + "}}\n" +
            "\n" +
            "    \\vspace{0.3 cm}\n" +
            "\n" +
            "    \\normalsize\n" +
            "    \\mbox{{\\footnotesize\\faMapMarker*}\\hspace*{0.13cm}" + user.getAddress().getCity() + ", " + user.getAddress().getState() + "}\n" +
            "    \\hspace{0.25 cm}\n" +
            "    \\mbox{\\href{mailto:" + user.getEmail() + "}{{\\footnotesize\\faEnvelope[regular]}\\hspace*{0.13cm}" + user.getEmail() + "}}\n" +
            "    \\hspace{0.25 cm}\n" +
            "    \\mbox{\\href{tel:" + user.getPhone() + "}{{\\footnotesize\\faPhone*}\\hspace*{0.13cm}" + user.getPhone() + "}}\n" +
            "    \\hspace{0.25 cm}\n" +
            "    \\mbox{\\href{" + user.getLinkedin() + "}{{\\footnotesize\\faLinkedinIn}\\hspace*{0.13cm}" + user.getLinkedin() + "}}\n" +
            "\\end{center}\n" +
            "\n" +
            "\\vspace{0.3 cm}\n";
        
        // About Me section
        String aboutMe = 
            "\\section{About Me}\n" +
            "\\begin{onecolentry}\n" +
            "    " + user.getAbout() + "\n" +
            "\\end{onecolentry}\n" +
            "\n";
        
        // Education section
        String education = "\\section{Education}\n";
        List<Education> educations = user.getEducation();
        
        for(Education e : educations) {
            String degree = e.getDegree();
            String university = e.getInstitution();
//            String location = e.ge().getCity() + ", " + e.getAddress().getState();
            String date = e.getDate().getStartDate() + " - " + e.getDate().getEndDate();
            String gpa = e.getGrade() + "%";
            
            education += 
                "\\begin{twocolentry}{\n" +
                "    " + date + "\n" +
                "}\n" +
                "    \\textbf{" + university + "}, " + degree + "\n" +
                "    \\begin{highlights}\n" +
                "        \\item GPA: " + gpa + "\n" +
                "    \\end{highlights}\n" +
                "\\end{twocolentry}\n" +
                "\n";
        }
        
        // Experience section
        String experience = "\\section{Work Experience}\n";
        for(Experience ex : user.getExperience()) {
            String company = ex.getCompany();
            String role = ex.getPosition();
            String date = ex.getDate().getStartDate() + " - " + ex.getDate().getEndDate();
            String location = ex.getJobMode(); // Using job mode as location
            
            experience += 
                "\\begin{twocolentry}{\n" +
                "    " + location + "\\\\\n" +
                "    " + date + "\n" +
                "}\n" +
                "    \\textbf{" + company + "}, " + role + "\n" +
                "    \\begin{highlights}\n" +
                "        \\item " + role + " at " + company + "\n" +
                "    \\end{highlights}\n" +
                "\\end{twocolentry}\n" +
                "\n";
        }
        
        // Projects section
        String projects = "\\section{Projects}\n";
        for(Project p : user.getProjects()) {
            String title = p.getTitle();
            String[] details = p.getDescription().split("\\.");
            
            projects += 
                "\\begin{twocolentry}{\n" +
                "    " + p.getDate().getStartDate() + " - " + p.getDate().getEndDate() + "\n" +
                "}\n" +
                "    \\textbf{" + title + "}\n" +
                "    \\begin{highlights}\n";
            
            for(String detail : details) {
                if(!detail.trim().isEmpty()) {
                    projects += "        \\item " + detail.trim() + "\n";
                }
            }
            
            projects += 
                "    \\end{highlights}\n" +
                "\\end{twocolentry}\n" +
                "\n";
        }
        
        // Skills section
        String skills = 
            "\\section{Skills}\n" +
            "\\begin{onecolentry}\n" +
            "    \\textbf{Languages:} " + user.getSkill().getLanguages() + "\n" +
            "\\end{onecolentry}\n" +
            "\n" +
            "\\begin{onecolentry}\n" +
            "    \\textbf{Developer Tools:} " + user.getSkill().getTools() + "\n" +
            "\\end{onecolentry}\n" +
            "\n" +
            "\\begin{onecolentry}\n" +
            "    \\textbf{Technologies:} " + user.getSkill().getTechnologies() + "\n" +
            "\\end{onecolentry}\n" +
            "\n" +
            "\\begin{onecolentry}\n" +
            "    \\textbf{Frameworks:} " + user.getSkill().getFrameworks() + "\n" +
            "\\end{onecolentry}\n" +
            "\n" +
            "\\end{document}";
        
        return template + aboutMe + education + experience + projects + skills;
    }
}