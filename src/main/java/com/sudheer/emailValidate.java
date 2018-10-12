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

public class emailValidate {
	
public String validate(String email) { 
		String status="false";

		try{
			InternetAddress internetAddress = new InternetAddress(email);
			internetAddress.validate();
			status="True";
	    }
	    catch(Exception e){
	    	e.printStackTrace();
		status="Exception";	   }
		//System.out.println(status);
		return status;
			
    }
	}}