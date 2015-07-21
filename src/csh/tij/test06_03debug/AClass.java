package csh.tij.test06_03debug;

public class AClass {
	int i;
	public AClass() {
		// TODO Auto-generated constructor stub
		System.out.println("AClass constructor");
	}
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
	public void seti(int i){
		this.i=i;
		System.out.println("i has been set at"+i);
	}
}
