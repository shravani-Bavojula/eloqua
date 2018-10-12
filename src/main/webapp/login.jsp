<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="true" %>
    <%@ page import="com.sudheer.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<jsp:useBean id= "m" class="com.sudheer.mail" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div id="header"></div>
<% 
Boolean state=false;
String fname=request.getParameter("fname");
String uname=request.getParameter("email");
String key=request.getParameter("password");
state=m.validate(uname,key);
String status=null;
if(state==true){
session.setAttribute("fname", fname);
session.setAttribute("uname", uname);
session.setAttribute("key", key);
session.setAttribute("status", "kjdbfskjfb");
}
else
{
session.setAttribute(uname, null);
session.setAttribute(key, null);
}
%>


<%if(state==true){ %>
<!-- Form Start -->

<div class="container">


<script>alert('Login Success');</script><br />
<center><div class="alert alert-success">Login Success 

<i class="glyphicon glyphicon-thumbs-up"></i></div>
<div class="alert alert-success"> Welcome <%=uname.subSequence(0, uname.indexOf("@")) %></div></center>
</div>



    <!-- /.container -->

<!-- Form End-->
<%} 
else {%>

<center>
<script>alert('Gmail Address or App Key is wrong. Please check your credentials and Re-login'); window.location.assign('login.html');</script>
</center>
<%} %>

<script> 
  $("#header").load("Header.jsp"); 
</script> 
</body>
</html>