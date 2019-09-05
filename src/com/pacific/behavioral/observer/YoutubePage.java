package com.pacific.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class YoutubePage implements Subscribable {

	private String pageTitle = "Design Patterns";
	
	private List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Subscriber o) {
		subscribers.add(o);
	}

	@Override
	public void unSubscribe(Subscriber o) {
		subscribers.remove(o);

	}

	@Override
	public void notify(NotifyMessage m) {
		subscribers.forEach(subscriber -> {
			subscriber.sendNotification("Hey " + subscriber.getName() + " "+ m.getMessageContent());
		});
		
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}
	

}
