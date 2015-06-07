package com.vishal.struts2.todolist;

import java.util.ArrayList ;
import com.opensymphony.xwork2.ActionSupport ;

public class DoneAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static ArrayList<ToDoListItem> todoArray = ToDoListAction.todoArray ;
	boolean done ;

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	public String execute() {
		
		return "success" ;
	}
}
