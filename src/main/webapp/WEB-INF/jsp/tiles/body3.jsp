<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: OneStar
  Date: 2018/5/28
  Time: 1:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach  items="${items2}" var="items">
    <div>
        <img src="${pageContext.request.contextPath }/data/imges/242424.png">
        <span>技术顾问:${items.name}</span>
        <p class="text-left">${items.position}：${items.introduce}</p>
    </div>
</c:forEach>
</body>
</html>
