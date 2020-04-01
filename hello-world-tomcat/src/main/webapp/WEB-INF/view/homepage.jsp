<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--
  Created by IntelliJ IDEA.
  User: Miguel
  Date: 01/04/2020
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
</head>
<body>
<br>
<br>
<h1>Welcome, Enter RHASHTAFARI Details</h1>
<hr />

<form:form action="saveRasta" method="post" modelAttribute="rasta">
    <table>
        <tr>
            <td>First Name</td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td>Phone Number</td>
            <td><form:input path="phoneNumber" /></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Submit</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
