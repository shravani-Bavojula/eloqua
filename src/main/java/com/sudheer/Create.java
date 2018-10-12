package com.sudheer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 2L; 

    public Create() {
        // TODO Auto-generated constructor stub
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	// For Tracing
	
	String text = request.getRequestURL()+"|"+request.getParameter("instance")+"|"+request.getParameter("siteId")+"|"+request.getParameter("asset")+"|"+request.getParameter("status");
	/*
	trace t=new trace();
	t.send(trace);
	*/
	try {
		String requestUrl = "https://s2121803030.t.eloqua.com/e/f2?elqFormName=apicheck&elqSiteId=2121803030&paragraphText="+text;
		URL url = new URL(requestUrl);
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	    connection.setDoInput(true);
	    connection.setDoOutput(true);
	    connection.setRequestMethod("POST");
	    //connection.connect();
	    connection.setRequestProperty("Accept", "application/json");
	    connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	    //System.out.println("1");
	    OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
		//writer.write(payload);
		//System.out.println("2");
		writer.close();
	    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    //StringBuffer jsonString = new StringBuffer();
	    //String line;
	    //while ((line = br.readLine()) != null) {
	    //        jsonString.append(line);
	    //}
	    //br.close();
	    //System.out.println("Hello 0");
	    connection.disconnect();
	} catch (Exception e) {
	        throw new RuntimeException(e.getMessage());
	}
	
	// For Tracing
		
		/*
		PrintWriter out = response.getWriter(); 
		response.setContentType("application/json"); 
		response.setCharacterEncoding("UTF-8");
		out.print("");
		out.flush();
		*/
		response.setStatus(200);
		
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	// For Tracing
	
	String text = request.getRequestURL()+"|"+request.getParameter("instance")+"|"+request.getParameter("siteId")+"|"+request.getParameter("asset")+"|"+request.getParameter("status");
	/*
	trace t=new trace();
	t.send(trace);
	*/
	try {
		String requestUrl = "https://s2121803030.t.eloqua.com/e/f2?elqFormName=apicheck&elqSiteId=2121803030&paragraphText="+text;
		URL url = new URL(requestUrl);
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	    connection.setDoInput(true);
	    connection.setDoOutput(true);
	    connection.setRequestMethod("POST");
	    //connection.connect();
	    connection.setRequestProperty("Accept", "application/json");
	    connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	    //System.out.println("1");
	    OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
		//writer.write(payload);
		//System.out.println("2");
		writer.close();
	    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    //StringBuffer jsonString = new StringBuffer();
	    //String line;
	    //while ((line = br.readLine()) != null) {
	    //        jsonString.append(line);
	    //}
	    //br.close();
	    //System.out.println("Hello 0");
	    connection.disconnect();
	} catch (Exception e) {
	        throw new RuntimeException(e.getMessage());
	}
	
	// For Tracing
	

	PrintWriter out = response.getWriter(); 
	response.setContentType("application/json"); 
	response.setCharacterEncoding("UTF-8");
	out.append("{  \"requiresConfiguration\": false }");
	out.flush();
	
	doGet(request, response);
	response.setStatus(200); 
	
}
}
