package csh.tij.test09_10;

import csh.tij.test08_060708.Node;

public class Music5 {
	public static void tune(Playable playable){
		playable.play(Node.C_SHARP);
	}
	public static void main(String[] args) {
		Instrument[] instruments=new Instrument[]{
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		for(Playable playable:instruments){
			tune(playable);
		}
	}
}
abstract class Instrument implements Playable{
	void adjust(){
		System.out.println(this+"adjusting");
	}
	@Override
	public abstract String toString();
	@Override
	public void play(Node node) {
		System.out.println(this+".play "+node);		
	}
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