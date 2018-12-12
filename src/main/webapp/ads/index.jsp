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
    <title>Title</title>
</head>
<body>
<%--<c:choose>--%>
	<%--<c:when test="${product != null}">--%>
		<%--<h1>Product name: ${product.name}</h1>--%>
		<%--<h3>Price: ${product.price}</h3>--%>
		<%--<p>${product.description}</p>--%>
	<%--</c:when>--%>
	<%--<c:otherwise>--%>
		<%--<h1>No product found</h1>--%>
	<%--</c:otherwise>--%>
<%--</c:choose>--%>

<%--<c:choose>--%>
	<%--<c:when test="${ad != null}">--%>
		<%--<h1>Title: ${ad.title}</h1>--%>
		<%--<p>${ad.description}</p>--%>
	<%--</c:when>--%>
	<%--<c:otherwise>--%>
		<%--<h1>No ad found</h1>--%>
	<%--</c:otherwise>--%>
<%--</c:choose>--%>

<c:forEach items="${ads}" var="ad">
	<h1>Title: ${ad.title}</h1>
	<p>${ad.description}</p>
</c:forEach>




</body>
</html>
