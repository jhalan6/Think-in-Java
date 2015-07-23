package csh.tij.test06_0405;
/*
/*
 * This practice is solved with 	package csh.tij.test06_03debug
 * 								package csh.tij.test06_03debugoff
 * Another ToRun.java is in csh.tij.test06_03debug
 * practice05 is in csh.tij.test06_03debug
 */
import csh.tij.test06_03debugoff.AClass;

public class ToRun {

	public static void main(String[] args) {
		new AClass().Debug2();
//		new csh.tij.test06_03debug.AClass().Debug2();
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The method Debug2() from the type AClass is not visible
//			at csh.tij.test06_04.ToRun.main(ToRun.java:10)
//
//		
//		System.out.println(new csh.tij.test06_03debug.AClass().s2);
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The field AClass.s2 is not visible
//			at csh.tij.test06_04.ToRun.main(ToRun.java:21)


	}

}
