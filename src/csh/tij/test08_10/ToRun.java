package csh.tij.test08_10;

public class ToRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BClass().func2();
		AClass aClass=(AClass)(new BClass());
		aClass.func2();
		AClass.func1();
		BClass.func1();
		
	}

}
class AClass{
	public static void func1(){
		System.out.println("inintial function1");
	}
	public void func2(){
		func1();
		System.out.println("inintial function2");
	}
}
class BClass extends AClass{
//	@Override
	public static void func1() {
		System.out.println("changed function1");
	}
}
