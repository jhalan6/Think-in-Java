package csh.tij.test03_13;
public class ToRun{
	static void Showchar(char c){
		System.out.println((int)c);
	}
	public static void main(String[] args) {
		Showchar('a');
		for (int i = 0; i < 26; i++) {
			Showchar((char)('a'+i));
		}
	}
}