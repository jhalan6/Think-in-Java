package csh.tij.test04_07;
public class ToRun{
	public static void main(String[] args) {
		int i=1;
		for (;;++i) {
			System.out.println(i);
			if (i==99) 
				break;
		}
		i=1;
		while (true) {
			System.out.println(i++);
			if (i>99) {
				return;
			}
		}
	}
}