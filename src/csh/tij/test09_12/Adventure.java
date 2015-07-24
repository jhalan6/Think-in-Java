package csh.tij.test09_12;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero=new Hero();
		hero.climb();
		hero.fight();
		hero.fly();
		hero.swim();
	}

}
class ActionCharactor{
	public void fight(){
		System.out.println("fight()");
		}
}
class Hero extends ActionCharactor implements CanClimb,CanFight,CanFly,CanSwim{
	@Override
	public void swim() {
		System.out.println("swim()");
	}
	@Override
	public void fly() {
		System.out.println("fly()");
	}
	@Override
	public void climb() {
		System.out.println("climb()");
	}
}