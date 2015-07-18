package csh.tij.test04_04;
public class ToRun{
	public static void main(String[] args) {
		int tag;
		for (int i = 1; i < 1000; i++) {
			tag=1;
			for (int j =2; j < i/2; j++) 
				if (i%j==0) {
					tag=0;
					break;
				}
			if (tag==1) {
				System.out.println(i);
			}
		}
	}
}