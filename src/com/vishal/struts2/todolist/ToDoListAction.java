package com.vishal.struts2.todolist;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport ;

public class ToDoListAction  extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String todolistItem ;
	private static ArrayList<String> todoArray  = new ArrayList<String>();
	
	
	public static ArrayList<String> getTodoArray() {
		// DEBUG
		System.out.println("DEBUG: getTodoArray called");
		return todoArray;
	}

	public static void setTodoArray(ArrayList<String> todoArray) {
		ToDoListAction.todoArray = todoArray;
	}

	private static String toDoListDisplay = "";
	

	public String execute() {
		todoArray.add(todolistItem) ;
		
		// DEBUG
		System.out.println(todoArray);
		
		toDoListDisplay = convertArrayToString(todoArray) ;
		System.out.println("toDoList: " + toDoListDisplay) ;
		return "success" ;
	}
	
	// Do we need to move all this to Welcome.jsp
	public String convertArrayToString(ArrayList<String> todoArray) {
		String todoString  = "" ;
		String deleteButtonHtml = "<input type=\"submit\" value=\"Delete\">" ;
		for(String s: todoArray) {
			todoString = todoString + "<BR>" + s + deleteButtonHtml ;
		}
		return todoString ;
	}

	public  String getToDoListDisplay() {
		return toDoListDisplay;
	}

	public static void setToDoList(String _toDoList) {
		ToDoListAction.toDoListDisplay = _toDoList;
	}
	
	// This also works.  Ignore for now.
	/*public void setToDoList(String toDoList) {
		this.toDoList = toDoList ;
	}*/

	public String getTodolistItem() {
		return todolistItem;
	}

	public void setTodolistItem(String todolistItem) {
		this.todolistItem = todolistItem;
	}
}
