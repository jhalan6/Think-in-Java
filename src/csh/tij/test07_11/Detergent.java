package csh.tij.test07_11;

import csh.tij.test00_00.Print;

public class Detergent {
	Cleanser cleanser=new Cleanser();
	public void append(String a){
		cleanser.append(a);
	}
	public void dilute() {
		cleanser.dilute();
	}
	public void apply() {
		cleanser.apply();
	}
	public void scrub() {
		cleanser.scrub();
	}
	@Override
	public String toString() {
		return cleanser.toString();
	}
	public static void main(String[] args) {
		Detergent detergent=new Detergent();
		detergent.dilute();
		System.out.println(detergent);
		Detergent x=new Detergent();
	    x.dilute(); x.apply(); x.scrub();
	    Print.print(x);
	}

}
class Cleanser {
	  private String s = "Cleanser";
	  public void append(String a) { s += a; }
	  public void dilute() { append(" dilute()"); }
	  public void apply() { append(" apply()"); }
	  public void scrub() { append(" scrub()"); }
	  public String toString() { return s; }
	  public static void main(String[] args) {
	    Cleanser x = new Cleanser();
	    x.dilute(); x.apply(); x.scrub();
	    Print.print(x);
	  }
	}	
