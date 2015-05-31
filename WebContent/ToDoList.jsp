<!-- 
1. Why is this needed? (Also, when does it get called?)
2. What does it do?
3. How does it work?
Why?
To get a todolist item from the user. It is called as soon as the application is started, since it is 
the welcome file in web.xml.

What?
It gets a todolist item from the user.

How?
Presents a textfield to the user, and a submit button.
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts 2 - ToDoList Application | vishal</title>
</head>
<body>
	<h2>Struts2 - ToDoList Application</h2>
	<s:actionerror />
	<s:form action="todolist" method="post">
		<s:textfield name="todolistItemLabel" key="label.todolistItemLabel" size="20" />
		<s:textfield name="todolistItemDate" key="label.todolistItemDate" size="20" />
		<s:textfield name="todolistItemTime" key="label.todolistItemTime" size="20" />
		<s:submit method="execute" key="label.todolistSubmit" align="center" />
	</s:form>
</body>
</html>