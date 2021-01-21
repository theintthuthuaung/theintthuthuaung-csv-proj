package com.theintthuthuaung.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Conversation extends AbstractEntity {

	private Date dateTime;
	private String sender;
	private String message;
	
	public String getSender() {
		return sender;
	}
	
	public Conversation sender(String sender) {
		this.sender = sender;
		return this;
	}
	
	public Conversation message(String message) {
		this.message = message;
		return this;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessagge(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
		.append(super.toString())
		.append("sender: " + sender)
		.append("message: " + message).toString();
	}
}
