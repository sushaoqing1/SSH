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
		<h4>Employee Input Page</h4>
	
		<s:form action="emp-save" method="post">
		<s:if test="id !=null">
		<s:textfield name="id" label="Id" disabled="true"></s:textfield>
		<s:hidden name = "id"></s:hidden>
		</s:if>
		<s:else>

		</s:else>
		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="age" label="Age"></s:textfield>
		<s:submit></s:submit>
		</s:form>
</body>
</html>