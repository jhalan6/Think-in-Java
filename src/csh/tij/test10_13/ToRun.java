package csh.tij.test10_13;

import csh.tij.test06_03debug.FirstInterface;

public class ToRun {
	public static FirstInterface ret(){
		return new FirstInterface() {
			
			@Override
			public void func3() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void func2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void func1() {
				System.out.println("anonymous funcalc()");
			}
		};
	}
	public static void main(String[] args) {
		FirstInterface firstInterface=ret();
		firstInterface.func1();
	}
}
