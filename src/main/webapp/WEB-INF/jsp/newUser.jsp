<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="title" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>注册账号</title>
</head>
<body>
<fieldset style="width: 280px;margin: auto">
    <legend>注册账号</legend>
    <form id="regForm" action="${pageContext.request.contextPath }/register" method="post">

        <table align="center">
            <tr>
                <td>
                    <label path="username">账号</label>
                </td>
                <td>
                    <input path="username" name="userName" id="username"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label path="password">密码</label>
                </td>
                <td>
                    <input password path="password" name="password" id="password"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label path="email">邮箱</label>
                </td>
                <td>
                    <input path="email" name="email" id="email"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label path="phone">手机号</label>
                </td>
                <td>
                    <input path="phone" name="phone" id="phone"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button id="register" name="register">提交</button>
                </td>
            </tr>
            <tr></tr>
            <tr>
                <td></td>
                <td><a href="${pageContext.request.contextPath }/home">Home</a>
                </td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
