package csh.tij.test03_12;
public class ToRun{
	public static void main(String[] args) {
		int i=-1;
		System.out.println(Integer.toBinaryString(i));
		i<<=1;
		System.out.println(Integer.toBinaryString(i));
		for(;;){
			i>>>=1;
			if(i!=0)
				System.out.println(Integer.toBinaryString(i));
			else
				break;
		}
	}
}