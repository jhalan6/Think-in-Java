package csh.tij.test03_07;

import java.util.Random;

public class coin{
	public boolean drop(){
		return new Random().nextInt()%2==0;
	}
}