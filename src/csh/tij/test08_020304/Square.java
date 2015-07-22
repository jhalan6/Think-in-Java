package csh.tij.test08_020304;

public class Square extends Shape{
	@Override
	public void func() {
		System.out.println("function overrided in Square class");
	}
	public Square() {
		System.out.println("Square constructor");
	}
	@Override
	public void draw() {
		System.out.println("A Square had been drawn");
	}
	@Override
	public void erase() {
		System.out.println("The Square had been erased");
	}
}
