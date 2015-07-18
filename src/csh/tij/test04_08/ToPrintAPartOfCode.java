package csh.tij.test04_08;
public class ToPrintAPartOfCode{
	public static void main(String[] args) {
		for (int i = 0; i < 26; i++) {
			System.out.println("case'"+(char)(i+'a')+"':");
			System.out.println("System.out.println(\""+(char)(i+'a')+"\");");
//			System.out.println("break;");
		}
	}
}