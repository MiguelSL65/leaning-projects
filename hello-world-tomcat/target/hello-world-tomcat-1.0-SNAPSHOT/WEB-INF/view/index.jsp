<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>
        My Page
    </title>
</head>
<body>
<h2>Submitted Info from FORM:</h2>
<br>
<h2>Welcome ${rasta.name}.</h2>
<p>Your Age is ${rasta.age} and your phone number is ${rasta.phoneNumber}.</p>
</body>
</html>