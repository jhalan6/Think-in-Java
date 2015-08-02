package csh.tij.test03_07;
public class AToRun{
	public AToRun(){
		if(new coin().drop())
			System.out.println("正");
		else
			System.out.println("反");
	}
	public static void main(String[] args) {
		new AToRun();
	}
}