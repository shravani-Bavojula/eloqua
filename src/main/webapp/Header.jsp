<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="WEB-INF/login.js"></script>

<style>

.topnav {
  overflow: hidden;
  background-color: #FD0B46;
  margin:auto;
}

.topnav a {
  float: left;
  display: block;
  color: white;
  text-align: center;
  padding:10px 15px 10px 15px;
  text-decoration: none;
  font-size: 14px;
}

.topnav a:hover {
  background-color: #ddd;
  color: green;
}
.topnav a.active {
    background-color: #4CAF50;
    color: white;
}

</style>
</head>
<body>
<% String status=(String)session.getAttribute("status"); 
String uname=(String)session.getAttribute("uname");%>
<div align="center" style="background-color:#000000;color:#FFFFFF;padding-top:10px;padding-bottom:10px;">
<img alt="Mail Blast V500" src="images/header.png" style="max-width:650px;width:90%;">
</div>
<div class="topnav">
<center><b>
<%if(status!=null){ %>
<span style="padding-left:10%;">
<%} %>
<%if(status==null){ %>
<span>
<%} %>
<a href="index.html">Home</a>
<%if(status==null){ %>
<a href="loginform.jsp" >Login</a>

<%} %>

<%if(status!=null){ %>
<a href="Send1Email.jsp" >Send Email</a>

<a href="SendGroupEmail.jsp" >Send Group Email</a>

<%} %>

<a href="#" >Help</a>

<a href="#" >About</a>
</span>
</b>

<% if(status!=null){ %>
<b>
<a href="logout.jsp">Logout</a>
<span style="float:right;"><a><%=uname.subSequence(0, uname.indexOf("@")) %></a></span>
</b>
<%} %>
</center>
</div>

</body>
</html>