package csh.tij.test10_24;

public class GreenHouseControls extends Controller{
	
	@SuppressWarnings("unused")
	private boolean light=false;
	public class LightOn extends Event{
		public LightOn(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			light=true;
		}
		@Override
		public String toString() {
			return "light is on";
		}
	}
	public class LightOff extends Event{
		public LightOff(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			light=false;
		}
		@Override
	public String toString() {
		return "light is off";
		}
	}
	
	@SuppressWarnings("unused")
	private boolean warter=false;
	public class WaterOn extends Event{
		public WaterOn(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			warter=true;
		}
		@Override
		public String toString() {
			return "water on";
		}
	}
	public class WaterOff extends Event{
		public WaterOff(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			warter=false;
		}
		@Override
		public String toString() {
			return "Water Off";
		}
	}
	
	@SuppressWarnings("unused")
	private String thermostat="Day";
	public class ThermostatNight extends Event{
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
				thermostat="Night";
		}
		@Override
		public String toString() {
			return "thermostat on night setting";
		}
	}
	public class ThermostatDay extends Event{
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			thermostat="Day";
		}
		@Override
		public String toString() {
			return "thermostat on Day setting";
		}
	}

	public class Bell extends Event{
		public Bell(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}
		@Override
		public String toString() {
			return "Bing";
		}
		
	}

	public class Restart extends Event{
		private Event[] eventlist;
		public Restart(long delayTime,Event[]  eventlist) {
			super(delayTime);
			this.eventlist=eventlist;
			for (Event event:eventlist) {
				addEvent(event);
			}
		}
		@Override
		public void action() {
			for(Event event:eventlist){
				event.start();
				addEvent(event);
			}
			start();
			addEvent(this);
		}
		@Override
		public String toString() {
			return "Restarting system";
		}
	}
	public class Terminate extends Event{
		public Terminate(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			System.exit(0);
		}
		@Override
		public String toString() {
			return "terminating";
		}
	}
	
	@SuppressWarnings("unused")
	private boolean fan=false;
	public class FanOn extends Event{
		public FanOn(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			fan=true;
		}
		@Override
		public String toString() {
			return "Fan On";
		}
	}
	public class FanOff extends Event{
		public FanOff(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			fan=true;
		}
		@Override
		public String toString() {
			return "Fan Off";
		}
	}
}
