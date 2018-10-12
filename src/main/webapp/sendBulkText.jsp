<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page session="true" %>
   <%@ page import="com.sudheer.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<div id="header"></div>
<jsp:useBean id= "m" class="com.sudheer.sendBulkEmail" />

<% 
status=(String)session.getAttribute("status");
String sendStatus;
if(status!=null){
uname=(String)session.getAttribute("uname");
String key=(String)session.getAttribute("key");
String fromname=(String)session.getAttribute("fname");
String to=request.getParameter("email");
String subject=request.getParameter("subject");
String body=request.getParameter("body");
//System.out.println("abc----"+uname+"=="+key+"=="+fromname+"=="+to+"=="+subject+"=="+body);
sendStatus=m.sendTextMail(uname,key,fromname,to,subject,body);
%>
 <!-- Success message -->
 <center>
 
<div class="alert alert-success" role="alert" id="success_message"><%=sendStatus %>&nbsp;&nbsp;<i class="glyphicon glyphicon-thumbs-up"></i></div>
<script>alert('Launch Iniatiated');</script>
 <%} 
else{
	%>
	<div class="alert alert-warning" role="alert" id="success_message">Invalid Sessions<i class="glyphicon glyphicon-thumbs-up"></i></div>
	<script>alert('Invalid Session. Please Re-login'); window.location.assign('login.html');</script>
	
	<% 
	}
 %>
 
 
<!-- Button -->
<br />
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <a href="SendEmail.jsp"><button type="submit" class="btn btn-warning" >Send Rich HTML Group Email<span class="glyphicon glyphicon-send"></span></button>
  </a>&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="SendTextEmail.jsp"><button type="submit" class="btn btn-warning" >Send Text Group Email<span class="glyphicon glyphicon-send"></span></button>
  </a></div>
</div>

</center>


<script> 
 // $("#header").load("Header.jsp"); 
</script> 
</body>
</html>