<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


	<title></title>
	<!-- <script src="WEB-INF/login.js"></script> -->
	<style type="text/css">
		  #success_message{ display: none;}
	</style>
	
</head>
<body>
<%@ include file="Header.jsp" %>
<% status=(String)session.getAttribute("status"); %>
<div id="header"></div>
<div height="5px" width="100%" style="background-color:#909090;padding-top:0px;padding-bottom:0px;">
<br>
</div>
<div class="container">
<%if(status==null){ %>
    <form class="well form-horizontal" action="login.jsp" method="post"  id="contact_form">
<fieldset>
<!-- Form Name -->
<legend>Mail Blast V500 Login</legend>
<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Sender Name</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="fname" placeholder="From Name" class="form-control"  type="text">
    </div>
  </div>
</div>



<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">Gmail Address</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="email" placeholder="E-Mail Address" class="form-control"  type="text" required>
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">App Key</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class=" 	glyphicon glyphicon-lock"></i></span>
  <input name="password" placeholder="Gmail App Key" class="form-control"  type="password" required>
    </div>
  </div>
</div>




<!-- Button -->
<div class="form-group" align="center">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button type="submit" class="btn btn-warning" >Login<span class="glyphicon glyphicon-send"></span></button>
  </div>
 
</div>
</fieldset>
</form>
<%}else{ %>
<script>alert('User Profile exists');window.location.assign("index.html");</script>
<%} %>
</div>
    <!-- /.container -->
	<div height="5px" width="100%" style="background-color:#909090;padding-top:0px;padding-bottom:0px;">
<br>
</div>
<script> 
  //$("#header").load("Header.jsp"); 
</script> 

</body>
</html>