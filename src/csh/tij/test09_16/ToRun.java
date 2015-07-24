package csh.tij.test09_16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class ToRun {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(new AClassAdapter(10));
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}
}
class AClass{
	public char next(){
		Random random=new Random();
		char result=(char)random.nextInt(127);
		return result;
	}
	public static void main(String[] args) {
		AClass aClass=new AClass();
		for (int i = 0; i < 10; i++) {
			System.out.println(aClass.next());
		}
	}
}
class AClassAdapter extends AClass implements Readable{
	AClass aclass=new AClass();
	private int count=0;
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count--==0)
			return -1;
		String result=Character.toString(next())+"";
		cb.append(result);
			return result.length();
	}
	public AClassAdapter(int i) {
		this.count =i;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(new AClassAdapter(100000));
		while (scanner.hasNext()) {
			System.out.println(scanner.next()+"12306");
		}
	}
}