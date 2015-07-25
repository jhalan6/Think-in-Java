package csh.tij.test09_17;

import csh.tij.test06_03debug.FirstInterface;
public class ToRun implements FirstInterface{

	public static void main(String[] args) {
//		A class out of the package of the Interface can use the data which didn't define a access
//		So it's a public
//		without any Object ToRun.data could be used
		System.out.println(ToRun.data);
//!		compile the file shows:The final field FirstInterface.data cannot be assigned
//!		data=15;
	}

	@Override
	public void func1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void func2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func3() {
		// TODO Auto-generated method stub
		
	}

}
