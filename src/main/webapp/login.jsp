<%--
  Created by IntelliJ IDEA.
  User: homefolder
  Date: 12/10/18
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
//	request.setAttribute("username", "admin");
//	request.setAttribute("password", "password");

//	String userName = request.getParameter("username");
//	String password = request.getParameter("password");



//	String message;
//	switch (request.getAttribute("username").toString() && request.getAttribute("password").toString()) {
//		case "admin", "password":
//			request.getRequestDispatcher("profile.jsp").forward(request, response);
//	}

%>



<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>

<%--<c:choose>--%>
	<%--<c:when test = "${userName.equals}" />--%>
	<%--<%request.getRequestDispatcher("profile.jsp").forward(request, response);%>--%>
<%--</c:choose>--%>
<form method="POST" action="">

	<label for="username">Username</label>
	<input id="username" name="username" type="text">
	<br>

	<label for="password">Password</label>
	<input id="password" name="password" type="password">
	<br>

	<input type="submit">
</form>

</body>
</html>
