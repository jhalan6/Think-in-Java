package csh.tij.test09_11;
import static csh.tij.test00_00.Print.*;
public class Apply {
	  public static void process(Processor p, Object s) {
	    print("Using Processor " + p.name());
	    print(p.process(s));
	  }
	}