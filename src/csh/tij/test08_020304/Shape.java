package csh.tij.test08_020304;

public class Shape {
	public Shape(){
		System.out.println("A Shape constructor");
	}
	public void draw() {}
	public void erase() {}
	public void func(){
		System.out.println("A shape function");
	}
}
class newShape extends Shape{
	@Override
	public void draw() {
		System.out.println("newShape.draw()");
	}
	@Override
	public void erase() {
		System.out.println("newShape.erase()");
		super.erase();
	}
	@Override
	public void func() {
		System.out.println("newShape.func()");
		super.func();
	}
	public newShape() {
		System.out.println("newShape()");
	}
}