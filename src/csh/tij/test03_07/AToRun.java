package csh.tij.test03_07;
public class AToRun{
	public AToRun(){
		if(new coin().drop())
			System.out.println("front");
		else
			System.out.println("rear");
	}
	public static void main(String[] args) {
		new AToRun();
	}
}