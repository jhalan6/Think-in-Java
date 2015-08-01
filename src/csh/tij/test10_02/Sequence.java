package csh.tij.test10_02;

public class Sequence{
	private Object[] items;
	private int next=0;
	private class SequenceSelector implements Selector{
		private int i=0;
		@Override
		public boolean end() {
			return items.length==i;
		}
		@Override
		public void next() {
			if (i<items.length) {
				++i;
			}
		}
		@Override
		public Object current() {
			return items[i];
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public Sequence(int i) {
		items=new Object[i];
	}
	public void add(Object x) {
		if (next<items.length) {
			items[next++]=x;
		}
	}
	public static void main(String[] args) {
		Sequence sequence=new Sequence(10);
		for (int i = 0; i < sequence.items.length; i++) {
			sequence.add(new NewString(Integer.toString(i)));
		}
		Selector selector=sequence.selector();
		for (int i = 0; i < sequence.items.length; i++) {
			System.out.println(selector.current());
			selector.next();
		}
	}
}
class NewString {
	String string;
	public NewString(String string) {
		this.string=string;
	}
	@Override
	public String toString() {
		return string;
	}
}
interface Selector{
	public boolean end();
	public void next();
	public Object current();
}