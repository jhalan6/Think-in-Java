package csh.tij.test10_24;

import java.util.ArrayList;

public abstract class Controller {
	private ArrayList<Event> eventlist=new ArrayList<Event>();
	public void addEvent(Event event) {
		eventlist.add(event);
	}
	public void run() {
		while (!eventlist.isEmpty()) {
			for(Event event:eventlist){
				if (event.ready()) {
					event.action();
					eventlist.remove(event);
				}
			}
		}
	}
}
