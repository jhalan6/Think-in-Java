package csh.tij.test04_09;
public class ToRun{
	static int front=0,rear=0;
	final static int maxsize=3;
	static int[] queue=new int[maxsize];
	static int temp=0;
	public static void main(String[] args) {
		enqueue(1);
		enqueue(1);
		for (int i = 0; i < 40; i++) {
			Fibonacci();
		}
	}
	static void enqueue(int value){
		rear=(rear+1)%maxsize;
		queue[rear]=value;
	}
	static int dequeue(){
		front=(front+1)%maxsize;
		return queue[front];
	}
	static int queue(){
		return queue[front];
	}
	static void Fibonacci(){
		if(temp==0){
			temp=dequeue();
			System.out.println(temp);
			}
		else {
			System.out.println(dequeue());
			enqueue(queue()+temp);
			temp=queue();
		}
	}
}