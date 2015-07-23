package csh.tij.test08_010517;

import static csh.tij.test00_00.Print.*;

public class ToRun {
	public static void Run(Cycle cycle) {
		cycle.ride();
	}
	public static void main(String[] args) {
		Cycle[] cycles=new Cycle[]{
				new Unicycle(),
				new Tricycle(),
				new Bicycle(),
		};
//		尝试一个意外
//		new Bicycle(){
//		public void balance() {System.out.println("a new balance");};
//		}.balance();
		
//!		cycles[0].balance();
//!		The method balance() is undefined for the type Cycle
		((Unicycle) cycles[0]).balance();
//		((Tricycle) cycles[1]).balance();
//！		The method balance() is undefined for the type Tricycle
		((Bicycle) cycles[2]).balance();
//		Run(new Cycle());
//		Run(new Tricycle());
//		Run(new Unicycle());
//		Run(new Bicycle());
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
	public void balance() {
		System.out.println("Unicycle.balance()");
	}
	@Override
	public	void ride() {
		this.wheels=1;
		print("Riding a Uncycle");
		wheels();
	}
	//overriding cycle's wheels() method
	@Override
	public int wheels() {
		System.out.println("wheels: "+wheels);
		return wheels;
	}
}
class Tricycle extends Cycle{
	@Override
	public	void ride() {
		this.wheels=3;
		print("Riding a Tricycle");
		wheels();
	}
}
class Bicycle extends Cycle{
	public void balance() {
		System.out.println("Bicycle.balance()");
	}
	//Using cycle's wheels() method
	Bicycle(){
		this.wheels=2;
	}
	@Override
	public void ride() {
		print("Riding a bicycle");
		wheels();
	}
	
}