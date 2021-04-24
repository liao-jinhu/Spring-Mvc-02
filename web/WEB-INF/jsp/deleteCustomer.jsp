<%--
  Created by IntelliJ IDEA.
  User: DESTROYER
  Date: 2021/4/24
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除客户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/deleteCustomer" method="post">

    <p>请输入要删除的客户id:<input name="id" type="text"></p>
    <p><input type="submit" name="submit" value="删除">

</form>
</body>
</html>
