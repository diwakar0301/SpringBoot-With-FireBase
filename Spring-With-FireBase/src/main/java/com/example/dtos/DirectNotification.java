package com.example.dtos;

public class DirectNotification 
extends AppNotification 
{
//	public DirectNotification() {
//		super();
//		
//	}
//
//	public DirectNotification( String target,String title,String message ) {
//		super(title, message);
//		this.target = target;
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	private String title;
	private String message;
	private String target;
}
