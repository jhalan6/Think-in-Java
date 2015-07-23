package csh.tij.test07_10;


public class Stem10 extends Root {
	Component1 cc1;
	Component2 cc2;
	Component3 cc3;
	public Stem10(String string){
		super(string+"secand hand");
		System.out.println("Stem constructor");
		cc1=new Component1(string+" Root construct cc1");
		cc2=new Component2(string+" Root construct cc2");
		cc3=new Component3(string+" Root construct cc3");
	}
	public static void main(String[] args) {
		new Stem10(" haha ");
	}
}
class Root{
	Component1 c1;
	Component2 c2;
	Component3 c3;
	public Root(String string) {
		System.out.println(string+" Root constructor");
		c1=new Component1(string+" Root construct c1");
		c2=new Component2(string+" Root construct c2");
		c3=new Component3(string+" Root construct c3");
	}
}
class Component1{
	Component1(String string){
		System.out.println("Component1 constructor"+string);
	}
}
class Component2{
	Component2(String string){
		System.out.println("Component2 constructor"+string);
	}
	
}
class Component3{
	Component3(String string){
		System.out.println("Component3 constructor"+string);
	}
	
}