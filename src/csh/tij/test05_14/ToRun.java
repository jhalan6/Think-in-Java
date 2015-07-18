package csh.tij.test05_14;
public class ToRun{
	public static void main(String[] args) {
		new AClass();
		AClass.print();
	}
}
class AClass{
	static String s1,s2="Hello";
	static{
		s1="world!";
		System.out.println("s1 done");
	}
	static void print(){
		System.out.println(s2+" "+s1);
	}
}