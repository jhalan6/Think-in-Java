package csh.tij.test05_2122;
public class ToRun{
	public static void main(String[] args) {
		for (AnEnum A:AnEnum.values()) {
			System.out.print("case ");
			System.out.print(A+":"+"\n");
			System.out.println("System.out.println("+"\""+A+"\""+");");
		
		switch (A) {
			case YIFEN:
			System.out.println("0.01");
			break;
			case LIANGFEN:
			System.out.println("0.02");
			break;
			case WUFEN:
			System.out.println("0.05");
			break;
			case YIMAO:
			System.out.println("0.10");
			break;
			case WUMAO:
			System.out.println("0.50");
			break;
			case YIKUAI:
			System.out.println("1.00");
			break;
		}
		}
	}
}