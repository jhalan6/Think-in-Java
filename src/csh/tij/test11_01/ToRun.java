package csh.tij.test11_01;

import java.util.ArrayList;

public class ToRun {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for (int i = 0; i < 10; i++) {
			gerbils.add(new Gerbil());
		}
		for (int i = 0; i < gerbils.size(); i++) {
			gerbils.get(i).hop();
		}
	}
}
class Gerbil{
	private static long counter=0;
	private final long gerbilNumber=counter++;
	public void hop() {
		System.out.println("No."+gerbilNumber+" Gerbil is Jumping");
	}
}