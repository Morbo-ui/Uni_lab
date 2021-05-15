<%@ page import="Logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: lbvf-
  Date: 26.04.2021
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <title>Falcon Heavy info</title>
</head>
<body>
<%@ page import="Logic.Cart" %>
<% Cart cart = (Cart)session.getAttribute("cart"); %>

<h1>FH info</h1>

<img src="img/FH_free.svg.png" width="120" height="484">

<h3>Falcon Heavy is a partially reusable heavy-lift launch vehicle designed and manufactured by SpaceX. It is derived from the Falcon 9 vehicle and consists of a strengthened Falcon 9 first stage as the center core with two additional Falcon 9-like first stages as strap-on boosters.Falcon Heavy has the highest payload capacity of any currently operational launch vehicle, and the third-highest capacity of any rocket ever to reach orbit, trailing the Saturn V and Energia.</h3>
</body>
</html>
