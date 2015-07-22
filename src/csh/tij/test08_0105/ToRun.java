package csh.tij.test08_0105;

import static csh.tij.test00_00.Print.*;

public class ToRun {
	public static void Run(Cycle cycle) {
		cycle.ride();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run(new Cycle());
		Run(new Tricycle());
		Run(new Unicycle());
		Run(new Bicycle());
//		new Bicycle().wheels();
	}

}
class Cycle{
	protected int wheels=0;
	public void ride(){
		print("Riding a Cycle");
		wheels();
	}
	public int wheels() {
		System.out.println("wheels: "+wheels);
		return wheels;
	} 
}
class Unicycle extends Cycle{
	@Override
	public	void ride() {
		// TODO Auto-generated method stub
		this.wheels=1;
		print("Riding a Uncycle");
		wheels();
	}
	//overriding cycle's wheels() method
	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		System.out.println("wheels: "+wheels);
		return wheels;
	}
}
class Tricycle extends Cycle{
	@Override
	public	void ride() {
		// TODO Auto-generated method stub
		this.wheels=3;
		print("Riding a Tricycle");
		wheels();
	}
}
class Bicycle extends Cycle{
	//Using cycle's wheels() method
	Bicycle(){
		this.wheels=2;
	}
	@Override
	public void ride() {
		// TODO Auto-generated method stub
		print("Riding a bicycle");
		wheels();
	}
	
}