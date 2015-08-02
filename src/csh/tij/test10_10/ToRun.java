package csh.tij.test10_10;

public class ToRun {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterParcel outerParcel=new OuterParcel();
		outerParcel.getAIfuncs(true).func1();
		outerParcel.getAIfuncs(false).func1();
	}

}
interface Ifuncs{
	void func1();
}
class OuterParcel{
	public Ifuncs getAIfuncs(boolean f){
		if (f) {
			class InnerParcel implements Ifuncs{
				@Override
				public void func1() {
					System.out.println("innerParcel");
				}
			}
			return new InnerParcel();
		} else {
			return null;
		}
	}
}