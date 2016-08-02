<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorPage.jsp</title>
</head>
<body>
<h1><%=exception.getMessage() %></h1>
<p>
	<%=exception.getLocalizedMessage()%>
</p>
<!-- 
	<%
		for (int i = 0; i <512; i++)
			out.print((char)i);

		
	%>
 -->
</body>
</html>