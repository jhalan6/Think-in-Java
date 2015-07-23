package csh.tij.test09_09;

import csh.tij.test08_060708.Node;

public class Music5 {
	public static void tune(Instrument instrument){
		instrument.play(Node.C_SHARP);
	}
	public static void main(String[] args) {
		Instrument[] instruments=new Instrument[]{
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		for(Instrument instrument:instruments){
			tune(instrument);
		}
	}
}
abstract class Instrument{
	void play(Node n){
		System.out.println(this+".play "+n);
	}
	void adjust(){
		System.out.println(this+"adjusting");
	}
	@Override
	public abstract String toString();
}
class Wind extends Instrument{
	@Override
	public String toString() {
		return "Wind";
	}
}
class Percussion extends Instrument{
	@Override
	public String toString() {
		return "Percussion";
	}
}
class Stringed extends Instrument{
	@Override
	public String toString() {
		return "Stringed";
	}
}
class Brass extends Wind {
	  public String toString() { 
		  return "Brass"; 
	  }
}	
class Woodwind extends Wind {
	  public String toString() { 
		  return "Woodwind"; 
	  }
}