package csh.tij.test06_03debug;

public class ToRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AClass AC=new AClass();
		System.out.println(AC.s1);
		System.out.println(AC.s2);
//		System.out.println(AC.s3);
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The field AClass.s3 is not visible
//
//			at csh.tij.test06_03debug.ToRun.main(ToRun.java:11)
		AC.Debug1();
		AC.Debug2();
//		AC.Debug3();
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The method Debug3() from the type AClass is not visible
//
//			at csh.tij.test06_03debug.ToRun.main(ToRun.java:17)
	}

}
