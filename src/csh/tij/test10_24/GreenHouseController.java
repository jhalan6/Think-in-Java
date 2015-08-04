package csh.tij.test10_24;

public class GreenHouseController {
	
	public static void main(String[] args) {
		GreenHouseControls greenHouseControls=new GreenHouseControls();
		greenHouseControls.addEvent(greenHouseControls.new Bell(9000));
		Event[] events={
			greenHouseControls.new ThermostatNight(0),
			greenHouseControls.new LightOn(200000),
			greenHouseControls.new LightOff(400000),
			greenHouseControls.new WaterOn(600000),
			greenHouseControls.new WaterOff(800000),
			greenHouseControls.new ThermostatDay(1400000),
			greenHouseControls.new FanOn(450000),
			greenHouseControls.new FanOff(650000)
			
		};
		greenHouseControls.addEvent(greenHouseControls.new Restart(2000000, events));
		if (args.length==1) 
			greenHouseControls.addEvent(greenHouseControls.new Terminate(Integer.parseInt(args[0])));
		greenHouseControls.run();
	}
}
