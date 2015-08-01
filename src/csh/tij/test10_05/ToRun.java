package csh.tij.test10_05;

public class ToRun {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		Outer.Inner inner1=new Outer().new Inner();
	}

}

class Outer{
	class Inner{
		public Inner() {
			System.out.println("Inner()");
		}
	}
	@SuppressWarnings("unused")
	public Outer() {
		System.out.println("Outer");
		Inner inner=new Inner();
	}
}
