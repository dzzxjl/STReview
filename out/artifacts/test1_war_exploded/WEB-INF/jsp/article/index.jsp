<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>麻雀理工科技评论</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <% String path = request.getContextPath();
    %>
    <link href="${path}/css/default.css" rel="stylesheet" type="text/css" media="all" />
    <link href="${path}/css/fonts.css" rel="stylesheet" type="text/css" media="all" />
    <!--[if IE 6]>
    <link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

</head>
<body>
<div id="header" class="container">
    <div id="logo">
        <h1><a href="#">麻雀理工科技评论</a></h1>
    </div>
    <div id="menu">
        <ul>
            <li class="current_page_item"><a href="./index.html" accesskey="1" title="">主页</a></li>
            <li><a href="article/index" accesskey="2" title="">文章列表</a></li>
            <li><a href="user/index" accesskey="3" title="">用户列表</a></li>
            <li><a href="./about.html" accesskey="4" title="">关于我们</a></li>
        </ul>
    </div>
</div>
<c:forEach var="listValue" items="${articlelist}">
<div id="banner">
    <div class="container">
        <div class="title">
            <h2>${listValue.title}</h2>
        </div>

        <p>${listValue.content}</p>
        <ul class="actions">
            <li><a href="/article/text?id=${listValue.id}" class="button">Etiam posuere</a></li>
        </ul>
    </div>
</div>
</c:forEach>
<div id="copyright" class="container">
    <p>Copyright &copy; 2014.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>
</div>

</body>
</html>