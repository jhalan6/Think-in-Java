package csh.tij.test10_16;

public class ToRun {

	public static void main(String[] args) {
		rideCycle(Unicycle.factory);
		rideCycle(Bicycle.factory);
		rideCycle(Tricycle.factory);
	}
	private static void rideCycle(CycleFactory cycleFactory) {
		cycleFactory.getCycle().ride();
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
		System.out.println("Unicycle.ride()");
	}
	public static CycleFactory factory=new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}
class Bicycle implements Cycle{
	@Override
	public void ride() {
		System.out.println("Bicycle.ride()");
	}
	public static CycleFactory factory=new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
}
class Tricycle implements Cycle{
	@Override
	public void ride() {
		System.out.println("Tricycle.ride()");
	}
	public static CycleFactory factory=new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
}