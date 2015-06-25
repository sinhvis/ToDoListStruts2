package com.vishal.struts2.todolist;

import com.opensymphony.xwork2.ActionSupport; 

public class CheckBoxAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private boolean checkMe ;

	public boolean isCheckMe() {
		return checkMe;
	}

	public void setCheckMe(boolean checkMe) {
		this.checkMe = checkMe;
	}
	
	public String execute() {
		return SUCCESS ;
	}
	
	public String display() {
		return NONE ;
	}

}
