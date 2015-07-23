package csh.tij.test09_07;

public class ToRun {
	public static void main(String[] args) {
		Rodent[] rodents=new Rodent[]{
			new Mouse(),new Gerbil(),new Hamster()	
		};
		for(Rodent rodent:rodents){
			rodent.eat();
		}
	}
}
class Mouse implements Rodent{
	@Override
	public void eat() {
		System.out.println("Mouse.eat()");
	}
}
class Gerbil implements Rodent{
	@Override
	public void eat() {
		System.out.println("Gerbil.eat()");
	}
}
class Hamster implements Rodent{
	@Override
	public void eat() {
		System.out.println("Hamster.eat()");
	}
}