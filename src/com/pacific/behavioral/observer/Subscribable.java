package com.pacific.behavioral.observer;

public interface Subscribable {
	
	public void subscribe(Subscriber o);

	public void unSubscribe(Subscriber o);

	public void notify(NotifyMessage m);

}
