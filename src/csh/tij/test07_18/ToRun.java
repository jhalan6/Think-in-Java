package csh.tij.test07_18;

import java.util.Random;

public class ToRun {
	static final int i1=new Random().nextInt();
	private final int i2=new Random().nextInt();
	public int geti2() {
		return i2;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ToRun toRun=new ToRun();
				System.out.println(toRun.i1);
				System.out.println(toRun.i2);
				ToRun toRun2=new ToRun();
				System.out.println(toRun2.i1);
				System.out.println(toRun2.i2);
				
	}

}
