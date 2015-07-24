package csh.tij.test09_1415;

public class ToRun {
	static void runinter1(inter1 inter1){inter1.func11();}
	static void runinter2(inter2 inter2){inter2.func21();}
	static void runinter3(inter3 inter3){inter3.func31();}
	static void runinter(inter inter){inter.func();}
	public static void main(String[] args) {
		BClass bClass=new BClass();
		runinter(bClass);
		runinter1(bClass);
		runinter2(bClass);
		runinter3(bClass);
		bClass.classfunc();
	}
}
interface inter1{
	void func11();
	void func12();
}
interface inter2{
	void func21();
	void func22();
}
interface inter3{
	void func31();
	void func32();
}
interface inter extends inter1,inter2,inter3{
	void func();
}
abstract
class AClass{
	abstract void classfunc();
}
class BClass extends AClass implements inter{

	@Override
	public void func11() {
		System.out.println("func11()");		
	}
	@Override
	public void func12() {
		System.out.println("func12()");		
	}
	@Override
	public void func21() {
		System.out.println("func21()");		
	}
	@Override
	public void func22() {
		System.out.println("func22()");		
	}
	@Override
	public void func31() {
		System.out.println("func31()");		
	}
	@Override
	public void func32() {
		System.out.println("func32()");		
	}
	@Override
	public void func() {
		System.out.println("func()");		
	}
	@Override
	void classfunc() {
		System.out.println("classfunc()");		
	}
}