package csh.tij.test07_09;

public class Stem extends Root {
	Component1 cc1;
	Component2 cc2;
	Component3 cc3;
	public Stem(){
		System.out.println("Stem constructor");
		cc1=new Component1();
		cc2=new Component2();
		cc3=new Component3();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stem();
	}

}
class Root{
	Component1 c1;
	Component2 c2;
	Component3 c3;
	public Root() {
		// TODO Auto-generated constructor stub
		System.out.println("Root constructor");
		c1=new Component1();
		c2=new Component2();
		c3=new Component3();
	}
}
class Component1{
	Component1(){
		System.out.println("Component1 constructor");
	}
}
class Component2{
	Component2(){
		System.out.println("Component2 constructor");
	}
	
}
class Component3{
	Component3(){
		System.out.println("Component3 constructor");
	}
	
}