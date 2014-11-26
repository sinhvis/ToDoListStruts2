<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts 2 - ToDoList Application | vishal</title>
</head>
<body>
<h2>Struts2 - ToDoList Application</h2>
<s:actionerror/>
<s:form action="todolist.action" method="post">
	<s:textfield name="todolistItem" key="label.todolistItem" size="20" />
	<s:submit method="execute" key="label.todolistSubmit" align="center" />
</s:form>
</body>
</html>