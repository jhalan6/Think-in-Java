package csh.tij.test11_03;

import java.util.ArrayList;

interface Selector {
	boolean end();
	Object current();
	void next();
}	

public class Sequence {
	private ArrayList<Object> items;
	public Sequence() { items = new ArrayList<Object>(); }
	public void add(Object x) {
		items.add(x);
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == items.size(); }
	    public Object current() { return items.get(i);}
	    public void next() {i++; }
	}
	public Selector selector() {
		return new SequenceSelector();
	}	
	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		for(int i = 0; i < 10; i++)
			sequence.add(i);
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + ", ");
			selector.next();
		}
	}
} 