package csh.tij.test07_13;

public class ToRun extends AClass{
	public void func(double f) {
		System.out.println("double");
	}
	public static void main(String[] args) {
		ToRun toRun = new ToRun();
		toRun.func(3f);
		toRun.func(3d);
		toRun.func("");
		toRun.func(5);
	}
}
class AClass{
	public void func(int i){
		System.out.println("int");
	}
	public void func(String string){
		System.out.println("string");
	}
	public void func(float f){
		System.out.println("float");
	}
}