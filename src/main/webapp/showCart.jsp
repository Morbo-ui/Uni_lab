<%--
  Created by IntelliJ IDEA.
  User: lbvf-
  Date: 26.04.2021
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@ page import="Logic.Cart" %>
    <% Cart cart = (Cart)session.getAttribute("cart"); %>

<p>Name <%= cart.getName() %></p>
</body>
</html>
