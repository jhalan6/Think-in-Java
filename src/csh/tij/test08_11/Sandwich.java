package csh.tij.test08_11;
import static csh.tij.test00_00.Print.*;
//import from TIJ open source code
class Meal {
	Meal() { print("Meal()"); }
}

class Bread {
	Bread() { print("Bread()"); }
}

class Cheese {
	Cheese() { print("Cheese()"); }
}

class Pickle{
	Pickle(){print("Pickle()");}
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

public class Sandwich extends PortableLunch {
		@SuppressWarnings("unused")
		private Bread b = new Bread();
		@SuppressWarnings("unused")
		private Cheese c = new Cheese();
		@SuppressWarnings("unused")
		private Lettuce l = new Lettuce();
		@SuppressWarnings("unused")
		private Pickle p=new Pickle();
		public Sandwich() { print("Sandwich()"); }
		public static void main(String[] args) {
			new Sandwich();
  }
}