<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h4>登录</h4>
	
		<s:form action="login" method="post">

		<s:textfield name="username" label="Username"></s:textfield>
		<s:textfield name="password" label="Password"></s:textfield>
		<s:submit></s:submit>
		 <a href="register.jsp">注册</a>
		</s:form>
</body>
</html>