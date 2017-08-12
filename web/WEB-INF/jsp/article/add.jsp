<%--
  Created by IntelliJ IDEA.
  User: dzzxjl
  Date: 2017/7/28
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="//cdn.bootcss.com/uikit/2.25.0/css/uikit.css" />
    <script src="//cdn.bootcss.com/uikit/2.25.0/js/uikit.js"></script>
</head>
<body>
<form action="/article/add" method="post" class="uk-form">
    <p>title<input type="text" name="title" /></p>
    content<textarea name="content"></textarea>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
