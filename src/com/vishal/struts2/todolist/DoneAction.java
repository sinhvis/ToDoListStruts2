package com.vishal.struts2.todolist;

import com.opensymphony.xwork2.ActionSupport ;

public class DoneAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean done ;

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	

}
