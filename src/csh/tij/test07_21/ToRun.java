package csh.tij.test07_21;

public class ToRun extends AClass{
@Override
	void func(){
	System.out.println("我就试试");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToRun().func();
	}
}
class AClass{
//	final 
//	Exception in thread "main" java.lang.VerifyError: class csh.tij.test07_21.ToRun overrides final method func.()V
	void func(){
		System.out.println("A final function");
	}
}