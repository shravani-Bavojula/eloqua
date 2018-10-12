<%@page import="java.io.FileReader"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.sudheer.*" %>
    <%@page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
	String file=request.getParameter("test");
	//FileReader fr=new FileReader(file);
	//BufferedReader br=new BufferedReader(new FileReader(file));
	FileInputStream data = new FileInputStream(file);
	BufferedInputStream br=new BufferedInputStream(data);
	out.println(br);
	/*String[] values=new String[100];
	int i=0;
	out.println(file);
	String sCurrentLine;
	while ((sCurrentLine = br.readLine()) != null) {
		values[i]=sCurrentLine;
		i++;
		out.println(sCurrentLine);
	}*/
}
catch(Exception e){
	out.println(e.getMessage());
} %>
</body>
</html>