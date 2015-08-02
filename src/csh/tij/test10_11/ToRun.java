package csh.tij.test10_11;

import csh.tij.test06_03debug.FirstInterface;

public class ToRun {
	
	public static void main(String[] args) {
		FirstInterface firstInterface=new BClass().ret();
		firstInterface.func1();
//		AClass cannot be resolved to a type
//		AClass cannot be resolved to a type
//!		((AClass)firstInterface).fun4();
//!		不可见
//!		new BClass().hoho().fun4();
	}
}
class BClass{
	private class AClass implements FirstInterface{

		@Override
		public void func1() {
			System.out.println("func1()");
		}

		@Override
		public void func2() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void func3() {
			// TODO Auto-generated method stub
			
		}
		@SuppressWarnings("unused")
		public void fun4(){
			System.out.println("ajdflsjd");
		}
		
	}
	public FirstInterface hoho(){
		return new FirstInterface() {
			@SuppressWarnings("unused")
			void func4(){
				System.out.println("222");
			}
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
				// TODO Auto-generated method stub
				
			}
		};
	}
	public FirstInterface ret(){
		return new AClass();
	}
}