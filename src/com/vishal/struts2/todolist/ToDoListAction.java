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
	private static String toDoListDisplay = "";
	

	public String execute() {
		todoArray.add(todolistItem) ;
		
		// DEBUG
		System.out.println(todoArray);
		
		// toDoListDisplay = toDoListDisplay + "<BR>"  + todolistItem + deleteButtonHtml;
		
		// + "<input type="submit" value="Delete">
		toDoListDisplay = convertArrayToString(todoArray) ;
		System.out.println("toDoList: " + toDoListDisplay) ;
		return "success" ;
	}
	
	public String convertArrayToString(ArrayList<String> todoArray) {
		String todoString  = "" ;
		String deleteButtonHtml = "<input type=\"submit\" value=\"Delete\">" ;
		for(String s: todoArray) {
			todoString = todoString + "<BR>" + s + deleteButtonHtml ;
		}
		return todoString ;
	}

	public  String getToDoListDisplay() {
		// gets todolist
		return toDoListDisplay;
	}

	public static void setToDoList(String _toDoList) {
		ToDoListAction.toDoListDisplay = _toDoList;
	}
	
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
