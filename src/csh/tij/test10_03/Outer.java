package csh.tij.test10_03;

public class Outer {
	private String string;
	private class Inner{
		public Inner() {
			System.out.println("Inner");
		}
		@Override
		public String toString() {
			return string;
		}
	}
	public Outer(String string) {
		this.string=string;
		System.out.println("Outer");
	}
	public Inner getInner() {
		return new Inner();
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Outer outer=new Outer("Try the function");
		Inner inner=outer.getInner();
		System.out.println(inner);
		inner=new Outer("").new Inner();
//!		inner=new Outer.Inner;
		Outer.Inner inner2=outer.getInner();
		System.out.println(inner);
	}
}
