package csh.tij.test05_15;

public class ToRun{
	public static void main(String[] args) {
		new AClass();
	}
}
class AClass{
	String s;
	{
		s="A String";
		System.out.println("s初始化");
	}
	public AClass() {
		// TODO Auto-generated constructor stub
		System.out.println("AClass");
	}
}