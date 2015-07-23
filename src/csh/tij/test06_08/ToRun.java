package csh.tij.test06_08;

public class ToRun {

	public static void main(String[] args) {
		ConnectionManager.addConnections();
		ConnectionManager.checkConnections();
		ConnectionManager.delConnections();
		ConnectionManager.checkConnections();
		ConnectionManager.delConnections();
		if(ConnectionManager.checkConnections()==null)
				System.out.println("都对着");
		ToRun T=new ToRun();
		System.out.println(T);
	}
	@Override
	public String toString() {
		super.toString();
		return"不会变的toString";
	}
}
