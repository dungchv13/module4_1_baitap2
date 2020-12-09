<%--
  Created by IntelliJ IDEA.
  User: DEII
  Date: 12/10/2020
  Time: 12:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dictionary</h1>
<form action="/search" >
    word: <input type="text" name="word">
    <button type="submit">Submit</button>
</form>


<p>

    <c:if test='${requestScope["result"] != null}'>
        <span class="result">${requestScope["result"]}</span>
    </c:if>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
</body>
</html>
