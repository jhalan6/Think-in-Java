package csh.tij.test10_08;

public class ToRun {
	public static void main(String[] args) {
		AClass aClass=new AClass();
		aClass.func2();
	}
}
class AClass{
	private int data=525;
	private void func(){
		System.out.println("func()");
	}
	class Inner{
		private int data2=525;
		void change(int i){
			data=i;
		}
		void fun(){
			func();
			System.out.println("fun()"+data+":"+data2);
		}
	}
	public void func2() {
		Inner i=new Inner();
		i.change(207);
		i.data2=207;
		i.fun();
	}
}