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
<title>Rich HTML Group Email</title>
<script type="text/javascript">
function bodyform(){
	/*var text = document.emailForm.body.value;
	text = text.replace(/\r?\n/g, '<br />');
	text = text.replace(" ","&nbsp;");
	document.emailForm.body.value=text;*/
	document.getElementById("emailForm").submit();
	
}
</script>
</head>
<body>
<%@ include file="Header.jsp" %>
<div id="header"></div>
<% 
status=(String)session.getAttribute("status");
%>


<%if(status!=null){ %>
<!-- Form Start -->

<div class="container"> 

<form class="well form-horizontal" action="sendBulk.jsp" method="post" name="emailForm" id="emailForm" >
<fieldset>
<!-- Form Name -->

<legend>Send Email</legend>
<!-- Email-->
       <div class="form-group">
  <label class="col-md-4 control-label">To E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="email" placeholder="To Address" class="form-control"  type="text" required>
    </div>
  </div>
</div>

<!-- Subject-->
       <div class="form-group">
  <label class="col-md-4 control-label">Subject</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="subject" placeholder="Subject Line" class="form-control"  type="text" required>
    </div>
  </div>
</div>


<!-- Body-->
<div class="form-group">
  <label class="col-md-4 control-label">Email Body</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-briefcase"></i></span>
        	<textarea class="form-control" name="body" placeholder="Body" required></textarea>
  </div>
  </div>
</div>
  </div>
</div>

<!-- Button -->
<center>
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button type="button" class="btn btn-warning" onclick="bodyform();">Send Email<span class="glyphicon glyphicon-send"></span></button>
  </div>
</div>
</center>

</fieldset>
</form>
</div>
    </div><!-- /.container -->

<!-- Form End-->
<%} 
else {%>
<div class="alert alert-warning" role="alert" id="success_message">Invalid Session </div>

<%} %>

<script> 
 // $("#header").load("Header.jsp"); 
</script> 
</body> 
</html>