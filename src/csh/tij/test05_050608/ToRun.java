package csh.tij.test05_050608;
public class ToRun{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.bark(1, "");
		d.bark("",1);
	}
}
class Dog{
	void bark(){
		System.out.println("barking");
	}
	void bark(int i,String s){
		for (int j = 0; j < i; j++) {
		bark();	
		this.bark();
		}
		System.out.println("howling");
	}
	void bark(String s,int i){
		for (int j = 0; j <i; j++) {
			System.out.println("howling");
		}
		bark();
	}
	
}