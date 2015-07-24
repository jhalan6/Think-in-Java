package csh.tij.test09_11;


public abstract class StringProcessor implements Processor{
  public String name() {
    return getClass().getSimpleName();
  }
  public abstract String process(Object input);
  public static String s =
    "If she weighs the same as a duck, she's made of wood";
  public static void main(String[] args) {
    Apply.process(new Upcase(), s);
    Apply.process(new Downcase(), s);
    Apply.process(new Exchange(), s);
  }
}	

class Upcase extends StringProcessor {
  public String process(Object input) { // Covariant return
    return ((String)input).toUpperCase();
  }
}

class Downcase extends StringProcessor {
  public String process(Object input) {
    return ((String)input).toLowerCase();
  }
}
class Exchange extends StringProcessor{
	@Override
	public String process(Object input) {
		String string=(String)input;
		char[] chars=new char[string.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[chars.length-1-i]=string.charAt(i);
		}
		return new String(chars);
	}
}
//
//class Splitter extends StringProcessor {
//  public String process(Object input) {
//    return Arrays.toString(((String)input).split(" "));
//  }	
//}