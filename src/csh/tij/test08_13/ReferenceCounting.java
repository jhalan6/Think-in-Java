package csh.tij.test08_13;
public class ReferenceCounting{
	public static void main(String[] args) {
		Shared shared=new Shared();
//		shared.dispose();
		Composing[] composings=new Composing[]{
			new Composing(shared),	
			new Composing(shared),	
			new Composing(shared),	
			new Composing(shared),	
			new Composing(shared),	
		};
		for(Composing composing:composings){
			composing.dispose();
		}
	}
}

class Shared{
	private int refcount=0;
	private static long countor=0;
	final private long id=countor++;
	public void addRef(){
		refcount++;
	}
	@Override
	public String toString() {
		return "Shared "+id;
	}
	public Shared(){
		System.out.println("creating "+this);
	}
	public void dispose(){
//		finalize();
		if(--refcount<=0){
//			finalize();
			refcount=0;
			System.out.println("Disposing "+this);
			}
	}
	@Override
	protected void finalize(){
		if (refcount>0) {
			System.out.println("error! the reference composing havn't been disposed");
		}
		else {
			System.out.println("Now is the right time to dispose shared");
		}
	}
}
class Composing{
	private Shared shared;
	private static long countor=0;
	final private long id=countor++;
	public Composing(Shared shared) {
		
		System.out.println("creating "+this);
		this.shared=shared;
		shared.addRef();
	}
	@Override
	public String toString() {
		return"Composing "+id;
	}
	public void dispose(){
		System.out.println("Disposing "+this);
		shared.dispose();
	}
}