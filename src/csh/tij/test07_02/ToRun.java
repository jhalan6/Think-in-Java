package csh.tij.test07_02;

public class ToRun extends Detergent{
	@Override
	public void scrub() {
		append(" ToRun().scrub()");
		super.scrub();
	}
	public void sterilize() {
		append("ToRun.sterilize");
	}
	public static void main(String[] args) {
		ToRun toRun=new ToRun();
		toRun.apply();
		toRun.dilute();
		toRun.foam();
		toRun.scrub();
		System.out.println(toRun);
	}
}
