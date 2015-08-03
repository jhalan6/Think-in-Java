package csh.tij.test10_17;

import java.util.Random;

public class ToRun {
	public static void dropSomething(SomethingToDropFactory Factory){
		System.out.println(Factory.getSomething().drop());
	}
	public static void main(String[] args) {
		dropSomething(coin.factory);
		dropSomething(dice.factory);
	}
}
abstract class SomethingToDrop{
	protected Random random=new Random();
	abstract String drop();
}
abstract class SomethingToDropFactory{
	abstract SomethingToDrop getSomething();
}
class coin extends SomethingToDrop{
	@Override
	String drop() {
		if (random.nextInt()%2==0) {
			return "正";
		}
		else {
			return "反";
		}
	}
	public static SomethingToDropFactory factory=new SomethingToDropFactory() {
		@Override
		SomethingToDrop getSomething() {
			return new coin();
		}
	};
}
class dice extends SomethingToDrop{
	@Override
	String drop() {
		return Integer.toString(random.nextInt(6)+1);
	}
	public static SomethingToDropFactory factory=new SomethingToDropFactory() {
		@Override
		SomethingToDrop getSomething() {
			return new dice();
		}
	};
}