package csh.tij.test07_08;

public class ToRun {
	public static void main(String[] args) {
		new Bclass();
		new Bclass(" construct");
	}
}
class AClass{
	public AClass(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("A constructor "+string);
	}
}
class Bclass extends AClass{

	public Bclass(String string) {
		super(string);
		System.out.println("constructor with arguments in Bclass");
		// TODO Auto-generated constructor stub
	}
	public Bclass() {
		super("constructor without arguments in Bclass");
		// TODO Auto-generated constructor stub
	}
}
