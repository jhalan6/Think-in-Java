package csh.tij.test08_060708;
import static csh.tij.test00_00.Print.*;

import java.util.Random;

public class Music3 {
	public static void tune(Instrument instrument){
		instrument.play(Node.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] instruments){
		for(Instrument instrument:instruments){
			tune(instrument);
		}
	}
	public static void main(String[] args) {
		InstrumentGenerator instrumentGenerator = new InstrumentGenerator();
		Instrument[] instruments=new Instrument[6];
		Instrument[] instruments2=new Instrument[6];
		instruments=new Instrument[]{
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Woodwind(),
				new Brass(),
				new Piano()
		};
		instruments2=new Instrument[]{
			instrumentGenerator.randomInstrumentGenerator(),	
			instrumentGenerator.randomInstrumentGenerator(),	
			instrumentGenerator.randomInstrumentGenerator(),	
			instrumentGenerator.randomInstrumentGenerator(),	
			instrumentGenerator.randomInstrumentGenerator(),	
			instrumentGenerator.randomInstrumentGenerator(),	
		};
		tuneAll(instruments2);
		tuneAll(instruments);
	}
}
class InstrumentGenerator{
	public Instrument randomInstrumentGenerator(){
	Random rand=new Random();
	switch(rand.nextInt(5)){
	case 0:
		return new Wind();
	case 1:
		return new Percussion();
	case 2:
		return new Stringed();
	case 3:
		return new Woodwind();
	case 4:
		return new Brass();
	case 5:
		return new Piano();
	default:
		return new Instrument();
	}
	}
}
class Instrument{
	public void play(Node node){
		print(""+new Instrument()+node);
	}
	protected void play(Instrument instrument,Node node){
		print(""+instrument+node);
	}
	@Override
	public String toString() {
		return "Instrument ";
	}
}
class Wind extends Instrument{
	@Override
	public void play(Node node) {
		play(new Wind(), node);
	}
	@Override
	public String toString() {
		return "Wind ";
	}
}
class Percussion extends Instrument{
	@Override
	public void play(Node node) {
		play(new Percussion(), node);
	};
	@Override
	public String toString() {
		return"Percussion ";
	}
}
class Stringed extends Instrument{
	private static Stringed stringed=new Stringed();
	@Override
	public void play(Node node) {
		// TODO Auto-generated method stub
		play(stringed, node);
	}
	@Override
	public String toString() {
		return "Stringed ";
	}
}
class Woodwind extends Wind{
	private static Woodwind woodwind=new Woodwind();
	@Override
	public void play(Node node) {
		play(woodwind, node);
	}
	@Override
	public String toString() {
		return "Woodwind ";
	}
}
class Brass extends Wind{
	@Override
	public void play(Node node) {
		play(new Brass(), node);
	}
	@Override
	public String toString() {
		return"Brass ";
	}
}
class Piano extends Instrument{
	@Override
	public void play(Node node) {
		play(new Piano(), node);
	}
	@Override
	public String toString() {
		return "Piano ";
	}
}