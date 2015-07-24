package csh.tij.test09_13;

public class ToRun {
	public static void main(String[] args) {
		AClass aClass=new AClass();
		((interface1)aClass).func1();
		((interface2)aClass).func2();
		((interface3)aClass).func1();
		((interface3)aClass).func2();
		((interface4)aClass).func1();
		((interface4)aClass).func2();
		((interface4)aClass).func3();
	}
}
class AClass implements interface4{
	@Override
	public void func1() {
	}
	@Override
	public void func2() {
	}
	@Override
	public void func3() {
	}
}
interface interface1{
	void func1();
}
interface interface2 extends interface1{
	void func2();
}
interface interface3 extends interface1{
	void func2();
}
interface interface4 extends interface2,interface3{
	void func3();
}