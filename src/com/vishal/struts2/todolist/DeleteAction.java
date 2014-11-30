package com.vishal.struts2.todolist;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport; 

public class DeleteAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static ArrayList<String> todoArray = ToDoListAction.todoArray ;
	
	public  ArrayList<String> getTodoArray() {
		return todoArray ;
	}

	public static void setTodoArray(ArrayList<String> todoArray) {
		ToDoListAction.todoArray = todoArray;
	}

	public String execute() {
		
		// DEBUG
		System.out.println("todoArray (before removal): " + todoArray);
		todoArray.remove(0) ;
		return "success" ;
	}

}
