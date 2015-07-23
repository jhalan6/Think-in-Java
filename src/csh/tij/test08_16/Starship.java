package csh.tij.test08_16;

import java.util.Random;

public class Starship {
	private AlertStatus alertStatus;
	public static void main(String[] args) {
		Starship starship=new Starship();
		starship.alertStatus=starship.randStatus();
		System.out.println(starship.alertStatus);
		starship.alertStatus=starship.randStatus();
		System.out.println(starship.alertStatus.i);
		System.out.println(starship.alertStatus);
		starship.alertStatus=starship.nextStatus();
		System.out.println(starship.alertStatus);
		
	}
	public AlertStatus nextStatus() {
		return returnAlertStatus((alertStatus.i+1)%3);
	}
	public AlertStatus preStatus() {
		return returnAlertStatus((alertStatus.i-1)%3);
	}
	public AlertStatus randStatus() {
		Random random=new Random();
		return returnAlertStatus(random.nextInt()%3);
	}
	private AlertStatus returnAlertStatus(int i) {
		switch (i) {
		case 0:
			return new Status1();
		case 1:
			return new Status2();
		case 2:
			return new Status3();
		default:
			return new Status2();
//					alertStatus;
	}
	}

}
abstract class AlertStatus{
//	public AlertStatus() {
//		System.out.println(status);
//		System.out.println(i);
//	}
	public int i=0;
	String status="Basic Status";
	@Override
	public String toString() {
		return status;
	}
}
class Status1 extends AlertStatus{
	public Status1() {
		i=0;
		this.status="Status 1";
	}
}
class Status2 extends AlertStatus{
	public Status2() {
		i=1;
		this.status="Status 2";
	}
}
class Status3 extends AlertStatus{
	public Status3() {
		i=2;
		this.status="status 3";
	}
}