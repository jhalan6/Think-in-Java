package csh.tij.test08_020304;

public class ToRun {
	public static void main(String[] args) {
		ShapeGenerateFactory shapeGenerateFactory=new ShapeGenerateFactory();
		Shape[] shapes=new Shape[5];
		for (int i = 0; i < shapes.length; i++) {
			shapes[i]=shapeGenerateFactory.randomShape();
		}
		for(Shape shape:shapes){
			shape.draw();
			shape.func();
		}
		for(Shape shape:shapes){
			shape.erase();
		}
	}
}
