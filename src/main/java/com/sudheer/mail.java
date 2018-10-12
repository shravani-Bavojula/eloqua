
package com.sudheer;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.omg.CORBA.Request;

//import com.mail.Swing;

public class mail {
	
public void hello(){
	System.out.println("******Sampath******");
}
public String sendTextMail(final String uname,final String key,String fromname,String to,String subject,String body) {  
	System.out.println("1-----"+uname+"=="+key+"=="+fromname+"=="+to+"=="+subject+"=="+body);
	Properties properties = new Properties();
	Session session; 
	Transport t;
	Message message;
	
	try{
    	properties.put("mail.smtp.host", "smtp.gmail.com");
    
    properties.put("mail.smtp.socketFactory.port", "465");
    properties.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.port", "465");
System.out.println("1");
    session = Session.getDefaultInstance(properties,
        new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(uname,key);
            }
        });
   t = session.getTransport("smtp");
   System.out.println("2");
   t.connect("smtp.gmail.com",uname,key);
   message = new MimeMessage(session);
   System.out.println("3");
	message.setFrom(new InternetAddress(uname,fromname));//username
	message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
   //String subject=Values[1];
	message.setSubject(subject);
	//message.setContent(body,"");
	message.setText(body);
	t.sendMessage(message, message.getAllRecipients());
	System.out.println("Sucessful");
	return to+" Email Sent";
    }
    catch(Exception e){
    	return to+" Email Sending Failed";
    	//System.out.println(e.getMessage());
	//	Swing a=new Swing();
		//System.out.println(e.getMessage()+"----> 1");
		//a.alert(e.getMessage());
    } }

public String sendMail(final String uname,final String key,String fromname,String to,String subject,String body) {  
	System.out.println("1-----"+uname+"=="+key+"=="+fromname+"=="+to+"=="+subject+"=="+body);
	Properties properties = new Properties();
	Session session; 
	Transport t;
	Message message;
	
	try{
    	properties.put("mail.smtp.host", "smtp.gmail.com");
    
    properties.put("mail.smtp.socketFactory.port", "465");
    properties.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.port", "465");
System.out.println("1");
    session = Session.getDefaultInstance(properties,
        new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(uname,key);
            }
        });
   t = session.getTransport("smtp");  
   System.out.println("2");
   t.connect("smtp.gmail.com",uname,key);
   message = new MimeMessage(session); 
   System.out.println("3");
	message.setFrom(new InternetAddress(uname,fromname));//username
	message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
   //String subject=Values[1];
	message.setSubject(subject);
	message.setContent(body,"text/html; charset=utf-8");
	t.sendMessage(message, message.getAllRecipients());
	System.out.println("Sucessful");
	return to+" Email Sent";
    }
    catch(Exception e){
    	return to+" Email Sending Failed";
    	//System.out.println(e.getMessage());
	//	Swing a=new Swing();
		//System.out.println(e.getMessage()+"----> 1");
		//a.alert(e.getMessage());
    } }

	public Boolean validate(final String uname,final String key) { 
		System.out.println(uname+key);
		//System.out.println("1-----"+uname+"=="+key+"=="+fromname+"=="+to+"=="+subject+"=="+body);
		Boolean status=false;
		Properties properties = new Properties();
		Session session; 
		Transport t;
		Message message;
		try{
	    	properties.put("mail.smtp.host", "smtp.gmail.com");
	    
	    properties.put("mail.smtp.socketFactory.port", "465");
	    properties.put("mail.smtp.socketFactory.class",
	            "javax.net.ssl.SSLSocketFactory");
	    properties.put("mail.smtp.auth", "true");
	    properties.put("mail.smtp.port", "465");
	System.out.println("1");
	    session = Session.getDefaultInstance(properties,
	        new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(uname,key);
	            }
	        });
	   t = session.getTransport("smtp");
	   System.out.println("1--t="+t);
	 t.connect("smtp.gmail.com",uname,key);
	 System.out.println("2--t="+t);
	 //t.notify();
	 t.close();
	  System.out.println("Validation Sucessful");
	  status=true;
	    }
	    catch(Exception e){
	    	//System.out.println(e.getMessage());
	    	e.printStackTrace();
//			Swing a=new Swing();
			//System.out.println(e.getMessage()+"----> 1");
	//		a.alert(e.getMessage());
	    }
		System.out.println(status);
		return status;
			
    }
	
	public String report(final String uname,final String key,String fromname,String to,String subject,String body) {  
		System.out.println("1-----"+uname+"=="+key+"=="+fromname+"=="+to+"=="+subject+"=="+body);
		Properties properties = new Properties();
		Session session; 
		Transport t; 
		Message message;
		
		try{
	    	properties.put("mail.smtp.host", "smtp.gmail.com");
	    
	    properties.put("mail.smtp.socketFactory.port", "465");
	    properties.put("mail.smtp.socketFactory.class",
	            "javax.net.ssl.SSLSocketFactory");
	    properties.put("mail.smtp.auth", "true");
	    properties.put("mail.smtp.port", "465");
	System.out.println("1");
	    session = Session.getDefaultInstance(properties,
	        new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(uname,key);
	            }
	        });
	   t = session.getTransport("smtp");
	   System.out.println("2");
	   t.connect("smtp.gmail.com",uname,key);
	   message = new MimeMessage(session);
	   System.out.println("3");
		message.setFrom(new InternetAddress(uname,fromname));//username
		message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
	   //String subject=Values[1];
		message.setSubject(subject);
		message.setContent(body,"text/html; charset=utf-8");
		t.sendMessage(message, message.getAllRecipients());
		System.out.println("Sucessful");
		return to+" Email Sent";
	    }
	    catch(Exception e){
	    	return to+" Email Sending Failed";
	    	//System.out.println(e.getMessage());
		//	Swing a=new Swing();
			//System.out.println(e.getMessage()+"----> 1");
			//a.alert(e.getMessage());
	    } }

	}
			

