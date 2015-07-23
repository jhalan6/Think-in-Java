package csh.tij.test07_15;
import csh.tij.test06_03debug.*;
/* combine with 06_03debug
 * 
 */
public class ToRun {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		AClass aClass=new AClass();
//		aClass.Debug2();
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The method Debug2() from the type AClass is not visible
//			at csh.tij.test07_15.ToRun.main(ToRun.java:11)
		BClass bClass=new BClass();
		bClass.func();
//		bClass.seti(5);
//		System.out.println(bClass.i);
//		The field AClass.i is not visible
	}

}
class BClass extends AClass{
	BClass(){
		System.out.println("BClass constructor");
	}
	public void func(){
		Debug2();
	}
}