<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>
function fun(){
	
	var settings = {
			  "async": true,
			  "crossDomain": true,
			  "url": "http://localhost:8080/Eloqua/Configure?instance=<%=request.getParameter("instance")%>",
			  "method": "GET",
			  "headers": {
			    "Content-Type": "application/json",
			    "cache-control": "no-cache",
			    "Postman-Token": "b2c9306a-da5c-4fac-ad9e-0a1ab4ebb158"
			  }
			}
			$.ajax(settings).done(function (response) {
			  console.log(response);
			});
	}
function fun2(){
	
	var settings = {
			  "async": true,
			  "crossDomain": true,
			  "url": "http://localhost:8080/Eloqua/Configure2?instance=<%=request.getParameter("instance")%>",
			  "method": "GET",
			  "headers": {
			    "Content-Type": "application/json",
			    "cache-control": "no-cache",
			    "Postman-Token": "b2c9306a-da5c-4fac-ad9e-0a1ab4ebb158"
			  }
			}
			$.ajax(settings).done(function (response) {
			  console.log(response);
			});
	}
function fun3(){
	
	var settings = {
			  "async": true,
			  "crossDomain": true,
			  "url": "https://secure.eloqua.com/api/cloud/1.0/feeders/instances/<%=request.getParameter("instance")%>",
			  "method": "PUT",
			  "headers": {
			    "Content-Type": "application/json",
			    "cache-control": "no-cache"
			  },
			  "processData": false,
			  "data": "{  \"requiresConfiguration\": false }"
			}

			$.ajax(settings).done(function (response) {
			  console.log(response);
			});
	}
</script>
<!--
<input type="button" value="Configure" onclick="fun()" />
<input type="button" value="Configure2" onclick="fun2()" />
<input type="button" value="Configure3" onclick="fun3()" />
-->
</body>
</html>