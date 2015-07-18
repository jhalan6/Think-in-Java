package csh.tij.test05_1011;
public class ToRun{
	public static void main(String[] args) {
		new AClass();
		System.gc();
		System.runFinalization();
	}
	
}
class AClass{
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
//		super.finalize();
		System.out.println("要销毁了");
	}
}