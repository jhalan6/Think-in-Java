package csh.tij.test07_01;

public class ToRun {
	private AClass aClass;
	public static void main(String[] args) {
		System.out.println(new ToRun());
		ToRun toRun=new ToRun();
		System.out.println(toRun);
		ToRun[] TT= new ToRun[10];
				TT[0]=new ToRun();
				TT[1]=new ToRun();
		for(ToRun aRun:TT){
			System.out.println(aRun);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(aClass==null){
			aClass=new AClass("惰性初始化");
		}
		return aClass.getS();
	}
}
class AClass{
	private String s;
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	AClass(String string){
		setS(string);
	}
}