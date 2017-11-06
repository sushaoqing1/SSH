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
	<h4>Employee List page</h4>
	
	<s:if test="#request.employees == null || #request.employees.size() ==0">
		没有任何用户信息
	
	</s:if>
	<s:else>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>AGE</td>
			<td></td>
			<td></td>
			</tr>	
			<s:iterator value="#request.employees">
			<tr>
			<td>${id}</td>
			<td>${name }</td>
			<td>${age }</td>
			<td><a href="emp-delete?id=${id}">删除 </a></td>
			<td><a href="emp-input?id=${id}">修改 </a></td>
			</tr>
			</s:iterator>	
		</table>
	
	</s:else>
	
	
</body>
</html>