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
		Done: CheckBox value: <s:property value="checkMe" />
		<s:form action="resultAction" namespace="/">
			<h2>
			<s:checkbox name="checkMe" fieldValue="true" label="Done" />
			</h2>
			<s:submit value="submit" name="submit" />
		</s:form>
		
		
		<s:form action="delete" method="post">
			<s:hidden name="deleteIndex" value="%{#todoStatus.index}" />
			<s:submit method="execute" key="label.todolistDelete" align="center" />
		</s:form>
		<br />
	</s:iterator>
	
	<s:checkbox name="checkMe" value="true" fieldValue="true" label="Check Me for Testing" />
	


<form id="formName" action="<?php echo $_SERVER['PHP_SELF'];?>" method="get">
    <input type ="checkbox" name="cBox[]" value = "3" onchange="document.getElementById('formName').submit()">3</input>
    <input type ="checkbox" name="cBox[]" value = "4" onchange="document.getElementById('formName').submit()">4</input>
    <input type ="checkbox" name="cBox[]" value = "5" onchange="document.getElementById('formName').submit()">5</input>
    <input type="submit" name="submit" value="Search" />
</form>

<s:checkbox label="checkbox test" name="checkboxField1" value="aBooleanValue" fieldValue="true"/>
<br />
HTML Checkbox Test: <input type="checkbox" name="checkboxField1" value="true" checked="checked" />

<br />

Another test struts checkbox (Check if this one shows up as checked). value = "true" means that it is checked.
<s:checkbox label="checkbox test" name="checkboxField1" value="false" fieldValue="false"/>
<br />
Supposed HTML equivalent of the following:
<input type="checkbox" name="checkboxField1" value="true" checked="checked" />

<br />
<br />
Supposedly correct checkBox
<s:checkbox name="done" value="done" fieldValue="done" label="Done" />
<br />

	<a href="http://localhost:8080/ToDoListStruts2/">Add another item.</a>
	<br />
	Noise
	Done: <input type ="checkbox" name="done" value = "done" onchange="document.getElementById('formName').submit()"></input>
</body>
</html>