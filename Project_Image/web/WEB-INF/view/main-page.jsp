<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HARDIK
  Date: 07-01-2020
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="imageInsert" method="post" enctype="multipart/form-data">
        <input type="text" name="username">
        <br>
        <input type="file" name="image"/>
        <br>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>
