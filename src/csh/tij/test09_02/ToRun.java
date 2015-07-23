package csh.tij.test09_02;
//test09_01 is in the csh.tij.test08_091214
public class ToRun {

	public static void main(String[] args) {
//!		AClass aClass=new AClass();
//!		Cannot instantiate the type AClass
		@SuppressWarnings("unused")
		AClass aClass=new AClass() {
		};
	}

}
abstract class AClass{
	
}