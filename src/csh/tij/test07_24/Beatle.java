package csh.tij.test07_24;
import csh.tij.test00_00.Print;

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		Print.print("i = " + i + ", j = " + j);
		j = 39;
	}
	@SuppressWarnings("unused")
	private static int x1 =
 	printInit("static Insect.x1 initialized");
	static int printInit(String s) {
	Print.print(s);
	return 47;
	}
}

class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		Print.print("k = " + k);
		Print.print("j = " + j);
}
	@SuppressWarnings("unused")
	private static int x2 =
			printInit("static Beetle.x2 initialized");
//	@SuppressWarnings("unused")
//	public static void main(String[] args) {
//		Print.print("Beetle constructor");
//		Beetle b = new Beetle();
//		Beetle beetle=new Beetle();
//	}
} 
public class Beatle extends Beetle{
	private int n =printInit("Beatle.k initialized");
	public Beatle(){
		Print.print("n="+n);
		Print.print("j="+j);
	}
	@SuppressWarnings("unused")
	private static int x3=printInit("static Beatle.x3 initialized");
	public static void main(String[] args) {
		Print.print("Beatle constructor");
		new Beatle();
	}
}
