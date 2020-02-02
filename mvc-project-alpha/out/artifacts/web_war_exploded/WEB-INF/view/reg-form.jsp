<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HARDIK
  Date: 05-01-2020
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student registration form</title>
</head>
<body>
    <center>
        <h2> Student registration form </h2>
        <br>
        <hr>


       <form:form action="show-detail" method="get" modelAttribute="student">
            First name : <form:input path="firstName"></form:input>
            <br>
            Second name : <form:input path="lastName"/>
            <br>
            <input type="submit" value="click">
        </form:form>
    </center>
</body>
</html>
