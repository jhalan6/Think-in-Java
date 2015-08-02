package csh.tij.test10_15;

public class ToRun {
	public static void main(String[] args) {
		BClass bClass=new BClass();
		bClass.name();
	}
}
class AClass{
	public AClass(int i) {
		
	}
}
class BClass{
	public AClass name() {
		return new AClass(5){
			
		};
	}
}