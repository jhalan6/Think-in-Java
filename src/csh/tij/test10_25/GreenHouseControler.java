package csh.tij.test10_25;

import csh.tij.test10_24.Event;

public class GreenHouseControler {
	public static void main(String[] args) {
		GreenHouseControls greenHouseControls=new GreenHouseControls();
		greenHouseControls.addEvent(greenHouseControls.new Bell(800));
		Event[] events={
				greenHouseControls.new ThermostatNight(0),
				greenHouseControls.new LightOn(200),
				greenHouseControls.new LightOff(400),
				greenHouseControls.new WaterOn(600),
				greenHouseControls.new WaterOff(800),
				greenHouseControls.new FanOn(1000),
				greenHouseControls.new FanOff(1200),
				greenHouseControls.new ThermostatDay(1400),
				greenHouseControls.new FanOn(1600),
				greenHouseControls.new FanOff(1800)
		};
		greenHouseControls.addEvent(greenHouseControls.new Restart(2500, events));
		if(args.length==1){
			greenHouseControls.addEvent(greenHouseControls.new Terminate(Integer.parseInt(args[0])));
		}
		greenHouseControls.run();
	}
}
