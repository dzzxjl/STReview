<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dzzxjl
  Date: 2017/7/19
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SSM</title>
  </head>
  <body>
  <h2>Student Information</h2>
  <form action="/user/addUser" method="post">
    <p>user_name<input type="text" name="user_name" /></p>
    <p>password<input type="text" name="password" /></p>
    <p>age<input type="text" name="age" /></p>
    <input type="submit" value="Submit" />
  </form>

  <a href="./user/showAll">显示所有用户</a>
  <form action="/user/deleteUser" method="post">
    <p>id<input type="text" name="id" /></p>
    <input type="submit" value="Submit" />
  </form>

  使用表单multi属性上传文件测试，后台使用Spring专属类
  <form action="/uploadfile" method="post" enctype="multipart/form-data">
    <label>文件上传</label>
    <input type="file" name="file" accept="">
    <input type="submit">
  </form>
  </body>
</html>
