package com.sudheer;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class sendBulkEmail {
	
	public String sendMail(final String uname,final String key,final String fromname,final String to,final String subject,final String body) {  
		Thread thread=new Thread(){public void run(){
		Properties properties = new Properties();
		Session session; 
		Transport t;
		Message message;
		int i=0,j=0,tokenCount=0;
		String TO[]=new String[500];
		System.out.println(to);
		TO=to.split(",");
		String returnValue="<!DOCTYPE html><html><head><style>"
				+ "table {    border-collapse: collapse;    width: 100%;}"
				+ "th, td {   text-align: left;    padding: 8px;}"
				+ "tr:nth-child(even){background-color:#f2f2f2}"
				+ "th {    background-color:#4CAF50;    color: white;}"
				+ "</style></head><body>"
				+ "<h2>Email Sent Report</h2>"
+  "<table class='table table-striped'><thead><tr><th>Email</th><th>Status</th></tr></thead><tbody>";
		
		Boolean status=false;
		
		while(i<TO.length)
		{
			

			try{
			
	    	properties.put("mail.smtp.host", "smtp.gmail.com");
	    	properties.put("mail.smtp.socketFactory.port", "465");
	    	properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	    	properties.put("mail.smtp.auth", "true");
	    	properties.put("mail.smtp.port", "465");
	    	session = Session.getDefaultInstance(properties,
	    			new javax.mail.Authenticator() {
	            		protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(uname,key);
	            }
	        });
	    	t = session.getTransport("smtp"); 
	    	System.out.println("2");
	    	t.connect("smtp.gmail.com",uname,key);
	    	status=true;
	    	
	    	while(status!=false && i<TO.length)
		    	{
		    	message = new MimeMessage(session);
		    	System.out.println("3");
		    	message.setFrom(new InternetAddress(uname,fromname));
		    	message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(TO[i]));
		    	//String subject=Values[1];
		    	message.setSubject(subject);
		    	message.setContent(body,"text/html; charset=utf-8");
		    	t.sendMessage(message, message.getAllRecipients());
		    	System.out.println("Sucessful");
		    	returnValue+="<tr><td>"+TO[i]+"</td><td>&nbsp;Sent</td></tr>";
		    	i++;
		    	if(i%40==0)
			    	{
			    	status=false;
			    	Thread.sleep(25000);
			    	}
		    	}
		    	
	    	}	    
	    catch(Exception e){
	    	tokenCount++;
	    	returnValue+="<tr><td>"+TO[i]+"</td><td>&nbsp;Failed</td></tr>";
	    	i++;
	    	if(tokenCount==5){
	    		returnValue+="</tbody></table></body></html>";
	    		mail reporting=new mail();
	    		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    		Date date = new Date();
	    		System.out.println(dateFormat.format(date));
	    		String SubjectLine="Bulk Mail Report - "+dateFormat.format(date);
	    		reporting.report("sudheer3223@gmail.com", "mutcdqrueouvborr", "Email Status Report", uname,SubjectLine , returnValue);
	    		//Sending Status Report Start End
	    		System.exit(0);
	    	}
	    }
			
		}
	
		returnValue+="</tbody></table></body></html>";
		//Sending Status Report Start
				mail reporting=new mail();
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
				String SubjectLine="Bulk Mail Report - "+dateFormat.format(date);
				reporting.report(uname, "mutcdqrueouvborr", "Email Status Report", uname,SubjectLine , returnValue);
				//Sending Status Report Start End
		}};
		thread.start();
		return "Launch Initiated, Reports will be sent to your Mail";
			}
	
	
	public String sendTextMail(final String uname,final String key,final String fromname,final String to,final String subject,final String body) {  
		Thread thread=new Thread(){ public void run(){
			System.out.println("B1");
		Properties properties = new Properties();
		Session session; 
		Transport t;
		Message message;
		int i=0,j=0,tokenCount=0;
		String returnValue="<!DOCTYPE html><html><head><style>table {    border-collapse: collapse;    width: 100%;}"
				+ "th, td {   text-align: left;    padding: 8px;}"
				+ "tr:nth-child(even){background-color:#f2f2f2}"
				+ "th {    background-color:#4CAF50;    color: white;}"
				+ "</style></head><body>"
				+ "<h2>Email Sent Report</h2>"
+  "<table class='table table-striped'><thead><tr><th>Email</th><th>Status</th></tr></thead><tbody>";
		String TO[]=new String[500];
		TO=to.split(",");
		Boolean status=false;
		while(i<TO.length)
		{
			System.out.println("B2");
			try{
	    	properties.put("mail.smtp.host", "smtp.gmail.com");
	    	properties.put("mail.smtp.socketFactory.port", "465");
	    	properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	    	properties.put("mail.smtp.auth", "true");
	    	properties.put("mail.smtp.port", "465");
	    	session = Session.getDefaultInstance(properties,
	    			new javax.mail.Authenticator() {
	            		protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(uname,key);
	            }
	        });
	    	t = session.getTransport("smtp");
	    	System.out.println("2--"+TO.length);
	    	t.connect("smtp.gmail.com",uname,key);
	    	status=true;
	    	while(status==true && i<TO.length)
	    	{
	    		System.out.println("B3");
	    	message = new MimeMessage(session);
	    	System.out.println("B4");
	    	message.setFrom(new InternetAddress(uname,fromname));
	    	message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(TO[i]));
	    	//String subject=Values[1];
	    	message.setSubject(subject);
	    	message.setText(body);
	    	t.sendMessage(message, message.getAllRecipients());
	    	System.out.println("Sucessful");
	    	returnValue+="<tr><td>"+TO[i]+"</td><td>&nbsp;Sent</td></tr>";
	    	i++;
	    	if(i%40==0){
	    	status=false;
	    	Thread.sleep(25000);
	    	System.out.println("-false-");
	    	}
	    	}
	    	}
	    catch(Exception e){
	    	System.out.println("error");
	    	returnValue+="<tr><td>"+TO[i]+"</td><td>&nbsp;Failed</td></tr>";
	    	i++;
	    	tokenCount++;
	    	if(tokenCount==5){
	    		returnValue+="</tbody></table></body></html>";
	    		mail reporting=new mail();
	    		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    		Date date = new Date(j);
	    		System.out.println(dateFormat.format(date));
	    		String SubjectLine="Bulk Mail Report - "+dateFormat.format(date);
	    		reporting.report("sudheer3223@gmail.com", "mutcdqrueouvborr", "Email Status Report", uname,SubjectLine , returnValue);
	    		//Sending Status Report Start End
	    		System.exit(0);
	    	} 
	    	
	    } 
		}  
		returnValue+="</tbody></table></body></html>";
		
		//Sending Status Report Start
		mail reporting=new mail();
		 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date(j);
		System.out.println(dateFormat.format(date));
		String SubjectLine="Bulk Mail Report - "+dateFormat.format(date);
		reporting.report("sudheer3223@gmail.com", "mutcdqrueouvborr", "Email Status Report", uname,SubjectLine , returnValue);
		//Sending Status Report Start End
	}
		};
		thread.start();
		return "Launch Initiated, Reports will be sent to your Mail";
	    }
	
	
}
