package csh.tij.test03_11;
public class ToRun{
//	public static void main(String [] args) {
//		int h = 0x10000000;
//		System.out.println(Integer.toBinaryString(h));
//		for(int i = 0; i < 28; i++) {
//			h >>>= 1;
//			System.out.println(Integer.toBinaryString(h));
//		}
//	}
	public static void main(String[] args) {
		
		int a=0x123123;
		System.out.println(Integer.toBinaryString(a));
		for(;;){
			a>>>=1;
			if(a!=0)
				System.out.println(Integer.toBinaryString(a));
			else
				break;
		}
	}	
}