package csh.tij.test10_19;


public class ToRun {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BClass bclass=new BClass();
		BClass.BInner binner=new BClass.BInner();
		AClass aClass=new ToRun().new AClass();
		ToRun toRun=new ToRun();
		aClass=toRun.new AClass();
		AClass.Inner inner=new ToRun().new AClass().new Inner();
		inner=aClass.new Inner();
	}
	class AClass{
		class Inner{
		}
	}
	static class BClass{
		static class BInner{
		}
	}
}