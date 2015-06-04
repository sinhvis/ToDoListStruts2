<!-- 
1. Why is this needed? (Also, when does it get called?)
2. What does it do?
3. How does it work?

Why?
Displays the list of todo items.
The todo items are shown with the corresponding Delete button, so that the user has a way of deleting the todo item.
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>Welcome</h2>

	ToDoList items:
	<br />
	<br />
	
	
	
	<s:iterator value="todoArray" status="todoStatus">
		Todolist Item: <s:property value="label" /> <br />
		Date: <s:property value="date" /> <br />
		Time: <s:property value="time" /><br />
		Priority: <s:property value="priority" /> <br />
		Description: <s:property value="description" /> <br />
		Done: <s:property value="done" /> <br />
		<s:checkbox name="done" value="done" fieldValue="done" label="Done" />
		
		<s:form action="delete" method="post">
			<s:hidden name="deleteIndex" value="%{#todoStatus.index}" />
			<s:submit method="execute" key="label.todolistDelete" align="center" />
		</s:form>
		<br />
	</s:iterator>
	
	<s:checkbox name="checkMe" value="true" fieldValue="true" label="Check Me for Testing" />


	<a href="http://localhost:8080/ToDoListStruts2/">Add another item.</a>
</body>
</html>