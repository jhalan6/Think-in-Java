package csh.tij.test06_03debug;

public class AClass {
	public void Debug(String s){
		System.out.println(s);
	}
	public void Debug1() {
		System.out.println("A public method!");
	}
	protected void Debug2(){
		System.out.println("A protected method!");
	}
	@SuppressWarnings("unused")
	private void Debug3() {
		System.out.println("A private method!");
	}
	public String s1="Public";
	protected String s2="Protected";
	@SuppressWarnings("unused")
	private String s3="private";
}
