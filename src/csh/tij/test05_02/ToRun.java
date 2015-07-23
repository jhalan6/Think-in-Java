package csh.tij.test05_02;
public class ToRun{
	public static void main(String[] args) {
		System.out.println(new AClass().S1);
		System.out.println(new AClass().S2);
	}
}
class AClass{
	String S1,S2="hello";
	public AClass() {
		S1="world";
	}
}