package csh.tij.test10_09;

public class ToRun {
	public static Ifuncs innerParcle() {
		class Inner implements Ifuncs{
			@Override
			public void func1() {
				System.out.println("Inner func1()");
			}
		}
		return new Inner();
	}
	
	public static void main(String[] args) {
		innerParcle().func1();
	}

}
interface Ifuncs{
	void func1();
}