<%--
  Created by IntelliJ IDEA.
  User: DESTROYER
  Date: 2021/4/23
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addCustomer" method="post">
    username:<input id="username" type="text"  class="form-control"   name="username" required>
   jobs: <input id="jobs" type="text"  class="form-control"   name="jobs" required>
    phone:<input id="phone" type="text"  class="form-control"   name="phone" required>
    <input type="submit" class="form-control"  value="添加">
</form>

</body>
</html>
