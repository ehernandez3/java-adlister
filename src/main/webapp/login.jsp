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

	if (request.getMethod().equalsIgnoreCase("POST")) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username != null && password != null) {
			if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password"))
				response.sendRedirect("profile.jsp");
		}
	}

%>



<html>
<jsp:include page="partials/head.jsp">
	<jsp:param name="title" value="Login" />
</jsp:include>
<body>
<h1>Login</h1>


	<%--<c:if test = '${param.username.equals("admin") && param.password.equals("password")}'>--%>
		<%--&lt;%&ndash;<c:redirect url="profile.jsp" />&ndash;%&gt;--%>
		<%--<jsp:forward page="/profile.jsp" />--%>
		<%--</c:if>--%>

<form method="POST" action="login.jsp">

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
