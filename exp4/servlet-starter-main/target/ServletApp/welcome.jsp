<%@ page language="java" %>
<%@ page import="java.util.Date" %>

<html>
<head>
    <title>Welcome Page</title>
</head>

<body>

    <h1>Welcome to RCOE</h1>

    <h2>Good Morning, <%= request.getParameter("name") %></h2>

    <p>Email ID: <%
     out.print(request.getParameter("email")); %></p>

    <%
        Date date = new Date();
    %>

    <h3>Current Date and Time: <b><%= date %></b></h3>

</body>
</html>