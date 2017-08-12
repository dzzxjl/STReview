<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
创建成功
<c:if test="${not empty list}">

    <ul>
        <c:forEach var="listValue" items="${list}">
            <li>${listValue.id}</li>
            <li>${listValue.userName}</li>
            <li>${listValue.password}</li>
            <li>${listValue.age}</li>
        </c:forEach>
    </ul>

</c:if>
<br>
</body>
</html>
