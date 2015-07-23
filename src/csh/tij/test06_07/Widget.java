package csh.tij.test06_07;

public class Widget {
	private Widget() {
		AClass A=new AClass();
		System.out.println("Widget()");
		System.out.println(A.s);
	}
	public static void Try(){System.out.println("success");}
}
