package com.resume.api;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.http.HttpServletResponse;

public class LatexOnlineConverter {

    public  void compileLatexToPdf(String resume,HttpServletResponse response) {

        // Set response headers for file download
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=resume.tex");

        // Write the LaTeX code to the response output stream
        try {
			response.getOutputStream().write(resume.getBytes());
			 response.getOutputStream().flush();
		     response.getOutputStream().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    }


}
