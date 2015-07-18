package csh.tij.test03_14;
public class ToRun{
	static void compare(String s1,String s2){
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println(s1==s2);
		System.out.println(s1!=s2);
	}
	public static void main(String[] args) {
		compare("","");
		compare("book", "nobook");
	}
}