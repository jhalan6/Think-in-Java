package csh.tij.test08_020304;

import java.util.Random;

public class ShapeGenerateFactory {
	public Shape generateACircle() {
		return new Circle();
	}
	public Shape generateASquare() {
		return new Square();
	}
	public Shape generateATriangle() {
		return new Triangle();
	}
	public Shape generateAnewShape() {
		return new newShape();
	}
	public Shape randomShape() {
		Random rand=new Random();
		int i=rand.nextInt(4);
		if (i==0) {
			return generateACircle();
		}
		else if (i==1) {
			return generateASquare();
		}
		else if(i==2){
			return generateATriangle();
		}
		else {
			return generateAnewShape();
		}
}
}