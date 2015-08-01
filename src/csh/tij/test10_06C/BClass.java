package csh.tij.test10_06C;

import csh.tij.test10_06A.Ifuncs;
import csh.tij.test10_06B.AClass;

public class BClass extends AClass {
	public Ifuncs insideClass(){
		return new Inner();
	}
	public static void main(String[] args) {
		new BClass().insideClass().fun1();
	}
}
