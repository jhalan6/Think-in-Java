package csh.tij.test08_091214;

public class ToRun extends Object {
	public Rodent getNewRodent(Rodent rodent) {
		return rodent.birth();
	}
	public static void main(String[] args) {
		Shared shared=new Shared();
//		ToRun toRun=new ToRun();
		Rodent[] rodents=new Rodent[]{new Mouse(shared),new Gerbil(shared),new Hamster(shared)};
		for (int i = 0; i < rodents.length; i++) {
//			System.out.println(toRun.getNewRodent(rodents[i]));
			rodents[i].dispose();
		}
	}

}
class Shared{
	private static long countor=0;
	final private long id=countor++;
	private int refcount=0;
	void addRef(){
		System.out.println("The shared used");
		refcount++;
	}
	public void dispose() {
		if(--refcount<=0){
			refcount=0;
			System.out.println("Disposing "+this);
		}
	}
	@Override
	public String toString() {
		return "Shared"+id;
	}
	Shared(){
		System.out.println("A new Shared");
	}
}
abstract class Rodent{
	protected Shared shared;
	public Rodent(Shared shared)
	{
//		System.out.println("Rodent initialed");
		this.shared=shared;
		this.shared.addRef();
	}
	abstract public Rodent birth();
	@Override
	public String toString() {
		return "Rodent";
	}
	abstract public void dispose();
//	{
//		System.out.println("Disposing "+this);
//		this.shared.dispose();
//	}
}
class Mouse extends Rodent{
	
	public Mouse(Shared shared) {
		super(shared);
		System.out.println("Mouse initialed");
	}
	@Override
	public Rodent birth() {
		return new Mouse(this.shared);
	}
	public String fortoString() {
		return "Mouse"; 
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Disposing"+this);
		this.shared.dispose();
	}
}
class Gerbil extends Rodent{
	public Gerbil(Shared shared) {
		super(shared);
		System.out.println("Gerbil initialed");
	}
	@Override
	public Rodent birth() {
		return new Gerbil(this.shared);
	}
	@Override
	public String toString() {
		return "Gerbil";
	}
	@Override
	public void dispose() {
		System.out.println("Disposing"+this);
		this.shared.dispose();
	}
}
class Hamster extends Rodent{
	public Hamster(Shared shared) {
		super(shared);
		System.out.println("Hamster initialed");
	}
	@Override
	public Rodent birth() {
		return new Hamster(this.shared);
	}
	@Override
	public String toString() {
		return "Hamster";
	}
	public void dispose() {
		System.out.println("Disposing"+this);
		this.shared.dispose();
	}
}