package csh.tij.test08_020304;

public class Circle extends Shape{
	@Override
	public	void func() {
		System.out.println("function overrided in Circle class");
	}
	public Circle(){
		System.out.println("Circle constructor");
	}
	@Override
	public void draw() {
		System.out.println("A Circle had been drawn");
	}
	@Override
	public void erase() {
		System.out.println("The circle had been erased");
	}
}
