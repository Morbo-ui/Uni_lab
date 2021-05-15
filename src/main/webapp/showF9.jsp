<%--
  Created by IntelliJ IDEA.
  User: lbvf-
  Date: 26.04.2021
  Time: 12:14
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
    <title>F9 description</title>
</head>
<body>
<%@ page import="Logic.Cart" %>
<% Cart cart = (Cart)session.getAttribute("cart"); %>

<h1>F9 information</h1>

<h3>Falcon 9 is a partially reusable two-stage-to-orbit medium-lift launch vehicle designed and manufactured by SpaceX in the United States. Both the first and second stages are powered by SpaceX Merlin engines, using cryogenic liquid oxygen and rocket-grade kerosene (RP-1) as propellants. Its name is derived from the fictional Star Wars spacecraft, the Millennium Falcon, and the nine Merlin engines of the rocket's first stage.The rocket evolved with versions v1.0 (2010–2013), v1.1 (2013–2016), v1.2 "Full Thrust" (2015–present), including the Block 5 Full Thrust variant, flying since May 2018. Unlike most rockets in service, which are expendable launch systems, since the introduction of the Full Thrust version, Falcon 9 is partially reusable, with the first stage capable of re-entering the atmosphere and landing vertically after separating from the second stage. This feat was achieved for the first time on flight 20 in December 2015.

</h3>

</body>
</html>
