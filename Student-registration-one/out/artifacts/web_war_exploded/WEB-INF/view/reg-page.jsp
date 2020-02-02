<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HARDIK
  Date: 04-01-2020
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration form</title>
</head>
<body>
    <center>
        <h2>Student Registration Form</h2>
        <br>
        <hr>
        <br>
        <form:form action="processForm" modelAttribute="student">
            First Name : <form:input path="firstName" />
            <br><br>
            Last Name : <form:input path="lastName"/>
            <br><br>
            Gender  : Male <form:radiobutton path="gender" value="male" />
                      Female <form:radiobutton path="gender" value="female" />
            <br><br>
            Address : <form:input path="address" />
            <br><br>
            City    : <form:input path="city" />
            <br><br>
            State   : <form:select path="state" >
                            <form:option value="Gujarat" label="Gujarat"></form:option>
                            <form:option value="Maharashtra" label="Maharashtra"></form:option>
                            <form:option value="Rajkot" label="Rajkot"></form:option>
                        </form:select>
            <br><br>
            Mobile  : <form:input path="mono" />
            <br><br>
            <br><br>
            Favourite Subjects:
            C++ <form:checkbox path="favsub" value="C++"/><br>
            Java <form:checkbox path="favsub" value="Java"/><br>
            Machine Learning <form:checkbox path="favsub" value="Machine Learning"/><br><br><br>

            <br><br>

            <input type="submit" value="Click mee">

        </form:form>

    </center>
</body>
</html>
