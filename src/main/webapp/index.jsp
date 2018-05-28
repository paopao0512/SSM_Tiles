<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="title" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <%-- 页面 title --%>
    <title><tiles:insertAttribute name="title"/></title>
    <link href="/data/homepage/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="../bootstrap-3.3.5-dist/css/bootstrap.css">
    <link href="/data/homepage/Untitled-3.css" rel="stylesheet" type="text/css">
    <link href="/data/homepage/Untitled-1base.css" rel="stylesheet" type="text/css">
</head>
<script src="data/homepage/jquery.min.js"></script>
<script  src="data/homepage/bootstrap.min.js"></script>
<body>
<tiles:insertAttribute name="top"/>
<tiles:insertAttribute name="nav"/>
<tiles:insertAttribute name="body"/>
<tiles:insertAttribute name="footer"/>
</body>
</html>
