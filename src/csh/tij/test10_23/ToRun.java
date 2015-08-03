package csh.tij.test10_23;

public class ToRun {
	public static void main(String[] args) {
		B b=new B();
		while (b.add(new A().A_fun1())) ;
		b.setNull(2);
		b.run();
		b.us[2]=new A().A_fun1();
		b.run();
	}
}
interface U{
	void U_fun1();
	void U_fun2();
	void U_fun3();
}
class A{
	private static int sum=0;
	private final int num=sum++;
	U A_fun1(){
		return new U() {
			@Override
			public void U_fun3() {
				System.out.println("A U_fun3()"+num);
			}
			@Override
			public void U_fun2() {
				System.out.println("A U_fun2()"+num);
			}
			@Override
			public void U_fun1() {
				System.out.println("A U_fun1()"+num);
			}
		};
	}
}
class B{
	U[] us=new U[10];
	private int now=0;
	boolean add(U u){
		if (now<10) {
			us[now++]=u;
			return true;
		}
		else {
			return false;
		}
	}
	boolean setNull(int i){
		if(i>=0&&i<10){
			us[i]=null;
			return true;
		}
		else {
			return false;
		}
	}
	void run(){
		for (int i = 0; i < us.length; i++) {
			if (us[i]!=null) {
				us[i].U_fun1();
				us[i].U_fun2();
				us[i].U_fun3();
			}
		}
	}
}