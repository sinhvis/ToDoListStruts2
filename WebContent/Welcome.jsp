<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>Welcome</h2>
	
	<%-- Your ToDoList item is <s:property value="todolistItem" />...! vishal --%>
<%-- 	Your ToDoList item length is <s:property value="lengthOfArray" />.  --%>
	ToDoList items: <s:property value="toDoList" />.
</body>
</html>