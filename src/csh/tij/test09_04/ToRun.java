package csh.tij.test09_04;

public class ToRun {
	static void func2(AClass aClass){
		((BClass)aClass).func();
//!		aClass.func();
//!		The method func() is undefined for the type AClass
	}
	static void func2(CClass cClass){
		cClass.func();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToRun.func2(new BClass());
		ToRun.func2(new DClass());
	}

}
abstract class AClass{
}
class BClass extends AClass{
	public void func(){
		System.out.println("BClass.func()");
	}
}
abstract class CClass{
	abstract void func();
}
class DClass extends CClass{
	@Override
	void func() {
		System.out.println("DClass.func()");
	}
	
}