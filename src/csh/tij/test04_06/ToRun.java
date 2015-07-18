package csh.tij.test04_06;

import java.util.Random;

public class ToRun{
	public static void main(String[] args) {
		Random rand=new Random();
		test(3,4,5);
		for(int i=0;i<1000;++i){
		test(rand.nextInt(),rand.nextInt(),rand.nextInt());
		test(rand.nextInt(),rand.nextInt(),rand.nextInt());
		test(rand.nextInt(),rand.nextInt(),rand.nextInt());
		test(rand.nextInt(),rand.nextInt(),rand.nextInt());}
	}
	static void test(int begin,int end,int testval){
		if (begin>end) {
			System.out.println("给这玩意都不对！");
		}
		else{
			if (testval<begin) {
				System.out.println("testval最小");
			}
			else if (testval>end) {
				System.out.println("testval最大");
			}
			else {	
				System.out.println("testval一般般啦");
			}
		}
	}
}