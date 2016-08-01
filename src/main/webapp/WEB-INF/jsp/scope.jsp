

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scope.jsp</title>
</head>
<body>
<h1>scope.jsp</h1>
<%

	// request scope rnum ++

   Integer rnum = (Integer) request.getAttribute("rnum");
   request.setAttribute("rnum", ++rnum);
   log("rnum =" + rnum );

   // session scope snum++
   
   Integer snum = (Integer) session.getAttribute("snum");
   session.setAttribute("snum", ++snum);
   log("snum =" + snum );
   
   
   // application scope snum++
   
   Integer anum = (Integer) application.getAttribute("anum");
   application.setAttribute("anum", ++anum);
   log("anum =" + anum );

%>
rnum= <%=request.getAttribute("rnum") %><br>
snum= <%=session.getAttribute("snum") %><br>
anum= <%=application.getAttribute("anum") %><br>

</body>
</html>