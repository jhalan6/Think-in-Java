package csh.tij.test07_1617;

public class Amphibian {
	public static void main(String[] args) {
		Frog frog=new Frog();
		frog.func3(frog);
	}
	protected void func1() {
		System.out.println("protected func1 from Amphibian");
	}
	public void func2(){
		System.out.println("public func3 from Amhibian");
	}
	public void func3(Amphibian amphibian) {
		amphibian.func1();
		amphibian.func2();
	}
}

class Frog extends Amphibian{
	@Override
	protected void func1() {
		// TODO Auto-generated method stub
		System.out.println("func1 from Frog");
		super.func1();
	}
}