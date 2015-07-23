package csh.tij.test09_03;

public class ToRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BClass();
	}

}
abstract class AClass{
	abstract void print();
	public AClass() {
		print();
	}
}
class BClass extends AClass{
	private int data=10;
	@Override
	void print() {
		System.out.println(data);
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}