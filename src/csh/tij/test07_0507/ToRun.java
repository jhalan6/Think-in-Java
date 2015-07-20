package csh.tij.test07_0507;

public class ToRun extends A{
	B b;
	public ToRun(int i) {
	// TODO Auto-generated constructor stub
		super(i);
		b=new B('a');
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToRun(3);
	}

}
class A{
	A(int i){
		System.out.println("A constructor"+i);
	}
}
class B extends A{
	B(char j){
		super(2);
		System.out.println("B constructor"+j);
	}
}