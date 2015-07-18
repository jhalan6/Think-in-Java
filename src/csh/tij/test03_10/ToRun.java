package csh.tij.test03_10;
public class ToRun{
	public static void main(String[] args) {
		int a=0xaaaa;
		int b=0x5555;
		System.out.println(Integer.toBinaryString(a^b));
		System.out.println(Integer.toBinaryString(a|b));
		System.out.println(Integer.toBinaryString(a&b));
	}
}