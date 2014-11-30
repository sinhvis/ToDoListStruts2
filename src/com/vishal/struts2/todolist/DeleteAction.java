package com.vishal.struts2.todolist;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport; 

public class DeleteAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static ArrayList<String> todoArray = ToDoListAction.todoArray ;
	private String deleteIndex; 
	
	public String getDeleteIndex() {
		return deleteIndex;
	}

	public void setDeleteIndex(String deleteIndex) {
		this.deleteIndex = deleteIndex;
	}

	
	public  ArrayList<String> getTodoArray() {
		return todoArray ;
	}

	public static void setTodoArray(ArrayList<String> todoArray) {
		DeleteAction.todoArray = todoArray;
	}

	public String execute() {
		
		todoArray.remove(Integer.parseInt(deleteIndex)) ;
		return "success" ;
	}

	
}
