package csh.tij.test03_09;
public class ToRun{
	public ToRun(float f) {
		System.out.println(f);
	}
	public ToRun(double d){
		System.out.println(d);
	}
	public static void main(String[] args) {
		new ToRun(Float.MAX_VALUE);
		new ToRun(Float.MIN_VALUE);
		new ToRun(Double.MAX_VALUE);
		new ToRun(Double.MIN_VALUE);
	}
}