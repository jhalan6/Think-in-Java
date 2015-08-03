package csh.tij.test10_24;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime) {
		this.delayTime=delayTime;
		start();
	}
	public void start(){
		eventTime=delayTime+System.nanoTime();
	}
	public boolean ready(){
		return System.nanoTime()>=eventTime;
	}
	abstract public void action();
	static class test{
		public static void main(String[] args) {
			Event event=new Event(300000) {
				@Override
				public void action() {
					System.out.println("action done");
				}};
				while(true){
					System.out.println(event.eventTime+"&"+System.nanoTime());
					if (event.ready()) {
						event.action();
						break;
					}
				}
				event.start();
				while(true){
					System.out.println(event.eventTime+"&"+System.nanoTime());
					if (event.ready()) {
						event.action();
						break;
					}
				}
		}
	}
}
