<%--
  Created by IntelliJ IDEA.
  User: DESTROYER
  Date: 2021/4/25
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/findCustomerByName" method="post">
<input type="text" name="username" placeholder="请输入要查询的客户名称">
<input type="submit"  value="模糊查询">
</form>

<table class="table table-hover table-striped">
    <thead>
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>jobs</th>
        <th>phone</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="customer" items="${requestScope.get('customer')}">
        <tr>
            <td>${customer.getId()}</td>
            <td>${customer.getUsername()}</td>
            <td>${customer. getJobs()}</td>
            <td>${customer.getPhone()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
