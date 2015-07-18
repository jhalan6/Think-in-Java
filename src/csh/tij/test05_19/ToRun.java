package csh.tij.test05_19;
public class ToRun{
	public static void main(String[] args) {
		new AClass().setStrings("hello","world");
	}
}
class AClass{
	static String[] ss;
	public void setStrings(String ...strings){
		ss=new String[strings.length];
		int i=0;
		for(String s:strings){
			ss[i++]=s;
			System.out.println(s);
		}
	}
}