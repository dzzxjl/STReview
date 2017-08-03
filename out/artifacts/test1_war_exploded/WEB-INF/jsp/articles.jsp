<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty articlelist}">
    <ul>
        <c:forEach var="listValue" items="${articlelist}">
            <li>${listValue.id}</li>
            <li>${listValue.title}</li>
            <li>${listValue.content}</li>
        </c:forEach>
    </ul>
</c:if>
</body>
</html>
