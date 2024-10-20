<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h1>All Products</h1>
<ul>
    <c:forEach var="product" items="${products}">
        <li>${product.title} - ${product.price} $</li>
    </c:forEach>
</ul>
</body>
</html>
