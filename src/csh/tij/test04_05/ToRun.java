package csh.tij.test04_05;
public class ToRun{
	public static void main(String[] args) {
		int i1=0x5555;
		int i2=0xaaaa;
		new operationyu();
		new operationhuo();
		new operationyihuo();
		operationyu.fun(i1, i2);
		operation.printb();
		operationhuo.fun(i1, i2);
		operation.printb();
		operationyihuo.fun(i1, i2);
		operation.printb();
	}
}
abstract class operation{
	public static void print(boolean i){
		System.out.print(i?1:0);
	}
	public static void printb(){
		System.out.println();
	}
	static void fun(int i,int j){
	}
	public static boolean check(int i){
		if(i%2==1)
			return true;
		else
			return false;
	}
}

class operationyu extends operation{
	static void fun(int i,int j) {
			if(i!=0||j!=0){
				print(check(i)&check(j));
				operationyu.fun(i/2,j/2);
				}
	}
}
class operationhuo extends operation{
	static void fun(int i, int j){
		if(i!=0||j!=0){
			print(check(i)|check(j));
			operationhuo.fun(i/2,j/2);
			}
	}
}class operationyihuo extends operation{
	static void fun(int i, int j){
		if(i!=0||j!=0){
			print(check(i)^check(j));
			operationyihuo.fun(i/2,j/2);
			}
	}
}