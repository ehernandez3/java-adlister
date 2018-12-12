<%--
  Created by IntelliJ IDEA.
  User: homefolder
  Date: 12/11/18
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<jsp:include page="../partials/head.jsp">
		<jsp:param name="title" value="Please Log In" />
	</jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<div class="container">

<c:forEach items="${ads}" var="ad">
	<h1>Title: ${ad.title}</h1>
	<p>${ad.description}</p>
</c:forEach>

		<%--<thead>--%>
			<%--<td>Title</td>--%>
			<%--<td>Description</td>--%>
		<%--</thead>--%>
<%--<c:forEach items="${ads}" var="ad">--%>
	<%--<table class="table">--%>
		<%--<tr>--%>
			<%--<td>${ad.title}</td>--%>
			<%--<td>${ad.description}</td>--%>
		<%--</tr>--%>
	<%--</table>--%>
<%--</c:forEach>--%>

</div>
</body>
</html>
