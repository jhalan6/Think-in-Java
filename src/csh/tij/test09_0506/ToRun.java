package csh.tij.test09_0506;

import csh.tij.test06_03debug.FirstInterface;

public class ToRun implements FirstInterface {

	@Override
	public void func1() {
		System.out.println("ToRun.func1()");
	}

	@Override
	public void func2() {
		System.out.println("ToRun.func2()");
	}

	@Override
	public void func3() {
		System.out.println("ToRun.func3()");
	}

	public static void main(String[] args) {
		new ToRun().func1();
		new ToRun().func2();
		new ToRun().func3();
	}
}
/*09_06在接口中若将方法定义为private，会出现提示，该方法不可以声明为该类型，
 * 且在不对方法权限进行声明时，也可以在其他包中被调用
 */
