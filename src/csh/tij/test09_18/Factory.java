package csh.tij.test09_18;

public class Factory {
	public static void buyCycle(CycleFactory cycleFactory){
		Cycle cycle=cycleFactory.getCycle();
		cycle.ride();
	}
	public static void main(String[] args) {
		buyCycle(new UnicycleFactory());
		buyCycle(new BicycleFactory());
		buyCycle(new TricycleFactory());
	}

}
interface Cycle{
	void ride();
}
interface CycleFactory{
	Cycle getCycle();
}
class Unicycle implements Cycle{
	@Override
	public void ride() {
		
	}
}
class Bicycle implements Cycle{
	@Override
	public void ride() {
		
	}
}
class Tricycle implements Cycle{
	@Override
	public void ride() {
		
	}
}
class UnicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
}
class BicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}
}
class TricycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Tricycle();
	}
}