package csh.tij.test06_06;

public class ToRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AClass A=new AClass();
		System.out.println(A.data);
		new BClass().change(A,5);
		System.out.println(A.data);
	}

}

class AClass{
	protected int data=10;	
}

class BClass{
	void change(AClass A,int i){
		A.data=i;
	}
}