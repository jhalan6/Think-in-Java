package csh.tij.test09_08;
import static csh.tij.test00_00.Print.*;
class Meal {
	Meal() { print("Meal()"); }
}

class Bread {
	Bread() { print("Bread()"); }
}

class Cheese {
	Cheese() { print("Cheese()"); }
}

class Lettuce {
	Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal {
	Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() { print("PortableLunch()");}
}

public class Sandwich extends PortableLunch implements FastFood{
	@SuppressWarnings("unused")
	private Bread b = new Bread();
	@SuppressWarnings("unused")
	private Cheese c = new Cheese();
	@SuppressWarnings("unused")
	private Lettuce l = new Lettuce();
  	public Sandwich() { print("Sandwich()"); }
  	public static void main(String[] args) {
  		new Sandwich();
  		new Sandwich().showEatTime();
  }
  	@Override
  	public int eatTime() {
  		return 6;
  	}
	@Override
	public void showEatTime() {
		System.out.println("It takes "+eatTime()+"to eat a"+this);
	}
	@Override
	public String toString() {
		return "Sandwich";
	}
}