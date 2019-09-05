package com.pacific.behavioral.observer;

public class Subscriber {
	private String name;
	private YoutubePage page;

	public Subscriber(String name, YoutubePage page) {
		super();
		this.name = name;
		this.page = page;
	}

	public YoutubePage getPage() {
		return page;
	}

	public void setPage(YoutubePage page) {
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sendNotification(String message) {
		System.out.println(message);
	}
}
