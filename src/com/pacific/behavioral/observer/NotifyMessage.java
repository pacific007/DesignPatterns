package com.pacific.behavioral.observer;

public class NotifyMessage {
	final String messageContent;

	public NotifyMessage (String m) {
	        this.messageContent = m;
	    }

	public String getMessageContent() {
		return messageContent;
	}
}
