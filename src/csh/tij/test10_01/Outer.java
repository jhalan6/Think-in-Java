package csh.tij.test10_01;

public class Outer {
	private class Inner{
		public Inner() {
			System.out.println("Inner");
		}
	}
	public Outer() {
		System.out.println("Outer");
	}
	public Inner getInner() {
		return new Inner();
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Outer outer=new Outer();
		Inner inner=outer.getInner();
		Outer.Inner inner2=outer.getInner();
		try1();
	}
	public static void try1() {
		@SuppressWarnings("unused")
		Inner inner=new Outer().getInner();
	}
}
