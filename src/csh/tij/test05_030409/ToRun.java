package csh.tij.test05_030409;
public class ToRun{
	public static void main(String[] args) {
		new AClass();
		new AClass("What's the fuck!");
	}
}
class AClass{
	public AClass() {
		System.out.println("A AClass has been created!");
	}
	AClass(String s){
		this();
		System.out.print(s+"\t");
		new AClass();
	}
}