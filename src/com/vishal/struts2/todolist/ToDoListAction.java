package com.vishal.struts2.todolist;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport ;

public class ToDoListAction  extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private String todolistItem ;
	// public static ArrayList<String> todoArray  = new ArrayList<String>();
	
	private String todolistItemLabel ;
	private String todolistItemDate ;
	private String todolistItemTime ;
	private String todolistItemPriority ;
	private String todolistItemDescription ;
	private boolean todolistItemDone ;
		
	private ToDoListItem todolistItem ;
	public static ArrayList<ToDoListItem> todoArray = new ArrayList<ToDoListItem>() ;
//	public static ArrayList<String> expOneList = new ArrayList<String>() ;
	
	private static ArrayList<String> expOneList = new ArrayList<String>()
			  {{ add("One");
			    add("Two");
			    add("Three");
			  }};
	
	


/*	public  ArrayList<String> getTodoArray() {
		return todoArray ;
	}

	public static void setTodoArray(ArrayList<String> todoArray) {
		ToDoListAction.todoArray = todoArray;
	}

	private static String toDoListDisplay = "";*/


	public  ArrayList<String> getExpOneList() {
		// DEBUG
		System.out.println("getExpOneList called!!!");
		
		return expOneList;
	}


	public void setExpOneList(ArrayList<String> expOneList) {
		// DEBUG
		System.out.println("setExpOneList called!!!");
		
		ToDoListAction.expOneList = expOneList;
	}
	
	public String getTodolistItemPriority() {
		return todolistItemPriority;
	}


	public void setTodolistItemPriority(String todolistItemPriority) {
		this.todolistItemPriority = todolistItemPriority;
	}




	public String execute() {
		// DEBUG
		System.out.println("todolistItemLabel: " + todolistItemLabel + "\ntodolistItemDate: " + todolistItemDate 
				+ "\ntodolistItemTime: " + todolistItemTime + "\ntodolistItemPriority: " + todolistItemPriority 
				+ "\ntodolistItemDescription: " + todolistItemDescription + "\ntodolistItemDone: " + todolistItemDone) ;
		
		// DEBUG
		System.out.println("Contents of expOneList:" + expOneList);
		
		ToDoListItem todolistItem = new ToDoListItem() ;
		// Need to populate todolistItem
		todolistItem.setLabel(todolistItemLabel);
		todolistItem.setDate(todolistItemDate);
		todolistItem.setTime(todolistItemTime);
		todolistItem.setPriority(todolistItemPriority);
		todolistItem.setDescription(todolistItemDescription);
		todolistItem.setDone(todolistItemDone);
		
		
		// Add the current Item to the ArrayList
		 todoArray.add(todolistItem) ;

		/*toDoListDisplay = convertArrayToString(todoArray) ;
		System.out.println("toDoList: " + toDoListDisplay) ;*/

		return "success" ;
	}


	public String getTodolistItemLabel() {
		return todolistItemLabel;
	}


	public void setTodolistItemLabel(String todolistItemLabel) {
		this.todolistItemLabel = todolistItemLabel;
	}


	public String getTodolistItemDate() {
		return todolistItemDate;
	}


	public void setTodolistItemDate(String todolistItemDate) {
		this.todolistItemDate = todolistItemDate;
	}


	public String getTodolistItemTime() {
		return todolistItemTime;
	}


	public void setTodolistItemTime(String todolistItemTime) {
		this.todolistItemTime = todolistItemTime;
	}


	public ToDoListItem getTodolistItem() {
		return todolistItem;
	}


	public void setTodolistItem(ToDoListItem todolistItem) {
		this.todolistItem = todolistItem;
	}


	public  ArrayList<ToDoListItem> getTodoArray() {
		return todoArray;
	}


	public  void setTodoArray(ArrayList<ToDoListItem> todoArray) {
		ToDoListAction.todoArray = todoArray;
	}


	public String getTodolistItemDescription() {
		return todolistItemDescription;
	}


	public void setTodolistItemDescription(String todolistItemDescription) {
		this.todolistItemDescription = todolistItemDescription;
	}


	public boolean getTodolistItemDone() {
		return todolistItemDone;
	}


	public void setTodolistItemDone(boolean todolistItemDone) {
		this.todolistItemDone = todolistItemDone;
	}
	
	
	
/*	public String getTodolistItem() {
		return todolistItem;
	}

	public void setTodolistItem(String todolistItem) {
		this.todolistItem = todolistItem;
	}*/

	// Don't really need this anymore.
//	public String convertArrayToString(ArrayList<String> todoArray) {
//		String todoString  = "" ;
//		String deleteButtonHtml = "<input type=\"submit\" value=\"Delete\">" ;
//		for(String s: todoArray) {
//			todoString = todoString + "<BR>" + s + deleteButtonHtml ;
//		}
//		return todoString ;
//	}

	// Don't really need this anymore.
	/*public  String getToDoListDisplay() {
		return toDoListDisplay;
	}*/

	// Don't really need this anymore.
	/*public static void setToDoList(String _toDoList) {
		ToDoListAction.toDoListDisplay = _toDoList;
	}*/

	// This also works.  Ignore for now.
	/*public void setToDoList(String toDoList) {
		this.toDoList = toDoList ;
	}*/
}
