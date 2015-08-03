package csh.tij.test10_21;

public class ToRun {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		new IAInterface.AClass().print(new IAInterface() {
			@Override
			public String func() {
				return "\nSth.";
			}
		});
	}
}
interface IAInterface{
	static class AClass{
		static void print(IAInterface iaInterface){System.out.println("AClass.print() in IAInterface"+iaInterface.func());}
	}
	String func();
}