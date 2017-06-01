<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Login" method= "post"> 

Username: <input type = "text" name = "username">
Password: <input type = "password" name = "userpwd" >
<input type ="submit" value = "Login to Maven">

</form>

<%
String errormessage = (String) request.getAttribute("error");
if(errormessage!= null)
{
	out.print(errormessage);
}

%>

</body>
</html>