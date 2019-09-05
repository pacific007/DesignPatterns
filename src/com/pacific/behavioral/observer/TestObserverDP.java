package com.pacific.behavioral.observer;

public class TestObserverDP {

	public static void main(String[] args) {
		YoutubePage page = new YoutubePage();
		page.setPageTitle("Design Patterns");

		Subscriber subscriber1 = new Subscriber("Prashant", page);
		Subscriber subscriber2 = new Subscriber("Rahul", page);
		Subscriber subscriber3 = new Subscriber("John", page);

		page.subscribe(subscriber1);
		page.subscribe(subscriber2);
		page.subscribe(subscriber3);

		page.notify(new NotifyMessage("Thanks for Subscribing the page."));
		
		page.unSubscribe(subscriber3);
		page.unSubscribe(subscriber2);
		System.out.println("Two subscriber Unsubscribed the page.");
		System.out.println("=======Sending notification to the remaining=====");
		page.notify(new NotifyMessage("Thanks for Subscribing the page."));

	}

}
