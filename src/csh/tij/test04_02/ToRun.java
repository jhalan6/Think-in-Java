package csh.tij.test04_02;

import java.util.Random;

public class ToRun{
	public static void main(String[] args) {
		Random Rand=new Random();
		int i1=Rand.nextInt(),i2=Rand.nextInt();
		for(int j=0;j<26;++j){
			System.out.println(i1);
			if(i1>i2)
				System.out.println("大于");
			else if (i1==i2) {
				System.out.println("等于");
			}
			else {
				System.out.println("小于");
			}
			i1=i2;
			i2=Rand.nextInt();
		}
	}
}