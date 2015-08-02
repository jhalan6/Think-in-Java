package csh.tij.test10_12;

public class ToRun {
	public static void main(String[] args) {
		AClass aClass=new AClass();
		aClass.ret().func1();
	}
}
class AClass{
	private int data=525;
	private void func(){
		System.out.println("func()"+data);
	}
	abstract class BClass{
		abstract void func1();
	}
	public BClass ret(){
		return new BClass(){
			@Override
			void func1() {
				data=100;
				func();
			}
			
		};
	}
}