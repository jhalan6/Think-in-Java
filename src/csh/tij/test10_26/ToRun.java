package csh.tij.test10_26;

public class ToRun{
	class BClass extends AClass.Inner{
		public BClass(AClass aClass, int i) {
			aClass.super(i);
		}
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	BClass bClass=new ToRun().new BClass(new AClass(), 0);
	}
}
class AClass{
	class Inner{
		public Inner(int i) {
		}
	}
}