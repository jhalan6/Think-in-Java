package csh.tij.test10_25;

import csh.tij.test10_24.Event;

public class GreenHouseControls extends csh.tij.test10_24.GreenHouseControls{
	@SuppressWarnings("unused")
	private boolean fountain=false;
	public class FountainOn extends Event{
		public FountainOn(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			fountain=true;
		}
		@Override
		public String toString() {
			return "fountain on";
		}
	}
	public class FountainOff extends Event{
		public FountainOff(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			fountain=false;
		}
		@Override
		public String toString() {
			return "fountain Off";
		}
	}
}
