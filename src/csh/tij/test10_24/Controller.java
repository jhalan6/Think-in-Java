package csh.tij.test10_24;

import java.util.ArrayList;
import java.util.List;

public abstract class Controller {
	
	 private List<Event> eventList = new ArrayList<Event>();
	  public void addEvent(Event c) { eventList.add(c); }
	  public void run() {
		  int i=0;
		  while(eventList.size() > 0)
		  { 
			  System.out.println(i+++"&"+System.nanoTime());
			  for(Event e : new ArrayList<Event>(eventList))
				  if(e.ready()) {
					  System.out.println(e);
					  e.action();
					  eventList.remove(e);
				  }
		  }
	  }
	@SuppressWarnings("unused")
	private static class ToRun{
		public static void main(String[] args) {
			Controller controller=new Controller() {
			};
			controller.addEvent(new Event(10000000) {
				
				@Override
				public void action() {
					System.out.println("10000000纳秒后");
				}
			});
			controller.run();
		}
	}
}
