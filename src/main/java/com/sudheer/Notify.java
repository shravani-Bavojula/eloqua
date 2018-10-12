package com.sudheer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Notify")
public class Notify extends HttpServlet {
	private static final long serialVersionUID = 2L; 

    public Notify() {
        // TODO Auto-generated constructor stub
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// For Tracing
		String trace = request.getRequestURL()+"|"+request.getParameter("instance")+"|"+request.getParameter("siteId")+"|"+request.getParameter("asset")+"|"+request.getParameter("status");
		trace t=new trace();
		t.send(trace);
		// For Tracing
		
		/*
		PrintWriter out = response.getWriter(); 
		response.setContentType("application/json"); 
		response.setCharacterEncoding("UTF-8");
		out.print("");
		out.flush();
		*/
		response.setStatus(204);
		
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	// For Tracing
	String trace = request.getRequestURL()+"|"+request.getParameter("instance")+"|"+request.getParameter("siteId")+"|"+request.getParameter("asset")+"|"+request.getParameter("status");
	trace t=new trace();
	t.send(trace);
	// For Tracing
	
	/*
	PrintWriter out = response.getWriter(); 
	response.setContentType("application/json"); 
	response.setCharacterEncoding("UTF-8");
	out.print("");
	out.flush();
	*/
	doGet(request, response);
	response.setStatus(204);
	
}
}
