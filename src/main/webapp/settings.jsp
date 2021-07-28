<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 7/28/21
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <nav class="navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar">
        <div class="container">
            <a class="navbar-brand logo" href="index.action">
                <img src="assets/img/logo.png" style="width: 81px;height: 50px;">
            </a>
            <button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="navbar-nav ml-auto">
                    <s:if test="%{#session.isConnect}">
                        <li class="nav-item"><span class="nav-link">Welecome <s:property value="#session.user.name" /></span></li>
                        <li class="nav-item"><a class="nav-link" href="logout.action"><img src="assets/img/icons/logout.svg"></a></li>
                        <li class="nav-item"><a class="nav-link" href="logout.action"><img src="assets/img/icons/settings.svg"></a></li>
                    </s:if>
                    <s:else>
                        <li class="nav-item"><a class="nav-link" href="login.action">Login</a></li>
                        <li class="nav-item"><a class="nav-link" href="register.action">Register</a></li>
                    </s:else>
                </ul>
            </div>
        </div>
    </nav>
</body>
</html>
