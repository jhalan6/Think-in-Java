package csh.tij.test09_19;

import java.util.Random;

public class Factory2 {
	public static void beginGame(GameFactory gameFactory) {
		gameFactory.getGame().drop();
	}
	public static void main(String[] args) {
		beginGame(new DropCoinFactory());
		beginGame(new DropDiceFactory());
	}
}

interface Game{
	Random random=new Random();
	void drop();
}
interface GameFactory{
	Game getGame();
}
class DropCoin implements Game{
	@Override
	public void drop() {
		if(random.nextInt()%2==0)
			System.out.println("front");
		else 
			System.out.println("rear");
	}
}
class DropDice implements Game{
	@Override
	public void drop() {
		int i=random.nextInt(5);
		System.out.println(i);
	}
	
}
class DropCoinFactory implements GameFactory{
	@Override
	public Game getGame() {
		return new DropCoin();
	}
}
class DropDiceFactory implements GameFactory{
	@Override
	public Game getGame() {
		return new DropDice();
	}
}