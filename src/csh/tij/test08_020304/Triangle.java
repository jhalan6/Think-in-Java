package csh.tij.test08_020304;

public class Triangle extends Shape {
	@Override
	public void func() {
		System.out.println("function overrided in Triangle class");
	}
	public Triangle() {
		System.out.println("Triangle constructor");
	}
	@Override
	public void draw() {
		System.out.println("A Triangle has been drawn");
	}
	@Override
	public void erase() {
		System.out.println("The Triangle has been erased");
	}
}
