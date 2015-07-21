package csh.tij.test07_19;

public class ToRun {
	public final AClass aClass;
	ToRun(){
		aClass=new AClass(0);
	}
	ToRun(int x){
		aClass=new AClass(x);
	}
	@SuppressWarnings({ "unused"/*, "static-access"*/ })
	public static void main(String[] args) {
		ToRun toRun = new ToRun(12306);
		ToRun toRun2 = new ToRun();
//!		toRun.aClass=new ToRun(12580);
//		Type mismatch: cannot convert from ToRun to AClass
		toRun.aClass.setI(12580);
//		toRun.main(new int[]{12,23});
	}
//	public static void main(int[] args) {
//		System.out.println(args[0]);
//	}
}
class AClass{
	@SuppressWarnings("unused")
	private int i;
	public AClass(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
		System.out.println("A AClass type has been initialed as "+i);
	}
	public void setI(int i) {
		this.i = i;
		System.out.println("A AClass type has been changed as "+i);
	}
}