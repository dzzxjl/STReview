
<%--
  Created by IntelliJ IDEA.
  User: dzzxjl
  Date: 2017/8/12
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article</title>
</head>
<body>
<%--从后台传入的变量还是需要使用${variable}的方式进行引用--%>
<c:set var="category" value="${article}" scope="session"></c:set>
Title: <c:out value="${article.title}"></c:out><br>
Author: <c:out value="${article.author}"></c:out><br>
<c:out value="${article.category}"></c:out><br>
Category:<c:if test="${article.category == 1}">
        <c:out value="虎嗅网"></c:out>
        </c:if>
        <c:if test="${article.category == 1}">
            <c:out value="ifanr"></c:out>
        </c:if>
        <c:if test="${article.category == 1}">
            <c:out value="其他"></c:out>
        </c:if>
<br>
Content: <c:out value="${article.content}"></c:out> <br>

</body>
</html>
