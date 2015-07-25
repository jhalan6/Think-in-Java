package csh.tij.test07_12;


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
	@Override
	public void Dispose() {
		cc1.Dispose();
		cc2.Dispose();
		cc3.Dispose();
		System.out.println("Stem disposed");
		super.Dispose();
	}
	public static void main(String[] args) {
		Stem stem=new Stem();
		try{
			
		}finally{
			stem.Dispose();
		}
	}

}
class Root{
	Component1 c1;
	Component2 c2;
	Component3 c3;
	public Root() {
		System.out.println("Root constructor");
		c1=new Component1();
		c2=new Component2();
		c3=new Component3();
	}
	public void Dispose(){
		c1.Dispose();
		c2.Dispose();
		c3.Dispose();
		System.out.println("Root disposed");
	}
	protected void name() {
		System.err.println("sth.");
	}
}
class Component1{
	Component1(){
		System.out.println("Component1 constructor");
	}
	public void Dispose(){
		System.out.println("component1 disposed");
	}
}
class Component2{
	Component2(){
		System.out.println("Component2 constructor");
	}
	public void Dispose(){
		System.out.println("component2 disposed");
	}
	
}
class Component3{
	Component3(){
		System.out.println("Component3 constructor");
	}
	public void Dispose(){
		System.out.println("component3 disposed");
	}
	
}