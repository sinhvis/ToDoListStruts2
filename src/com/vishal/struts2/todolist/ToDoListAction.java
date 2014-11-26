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
	private int lengthOfArray ;
	private static String toDoList = "";
	
	public int getLengthOfArray() {
		return lengthOfArray;
	}

	public void setLengthOfArray(int lengthOfArray) {
		this.lengthOfArray = lengthOfArray;
	}

	public String execute() {
		todoArray.add(todolistItem) ;
		
		// DEBUG
		System.out.println(todoArray);
		
		// For setting the length of the array.  
		// Not in user anymore.
		setLengthOfArray(todoArray.size());
		
		// Add item to toDoList
		toDoList = toDoList + todolistItem ;
		// DEBUG
		System.out.println("toDoList: " + toDoList) ;
		return "success" ;
	}

	public  String getToDoList() {
		return toDoList;
	}

	/*public static void setToDoList(String _toDoList) {
		ToDoListAction.toDoList = _toDoList;
	}*/
	
	public void setToDoList(String toDoList) {
		// sets toDoList
		this.toDoList = toDoList ;
	}

	public String getTodolistItem() {
		return todolistItem;
	}

	public void setTodolistItem(String todolistItem) {
		this.todolistItem = todolistItem;
	}
	

}
