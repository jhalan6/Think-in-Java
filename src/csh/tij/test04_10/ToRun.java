package csh.tij.test04_10;
public class ToRun{
	static int a[]=new int[4];
	public static void main(String[] args) {
		int A,B;
		bookmark:
		for (int i = 1000; i < 9999; i++) {
			exchange(i);
			for (int j = 0; j <4; j++) {
				for (int j2 = 0; j2 <4; j2++) {
					for (int k = 0; k <4; k++) {
						if(j!=j2&&j!=k&&j2!=k){
							A=a[j]*10+a[j2];
							B=a[k]*10+a[6-j-j2-k];
							if(A*B==i){
								System.out.println(""+A+"*"+B+"="+i);
								continue bookmark;
							}
						}
					}
				}
				
			}
		}
	}
	static void exchange(int i){
		a[0]=i%10;
		i/=10;
		a[1]=i%10;
		i/=10;
		a[2]=i%10;
		i/=10;
		a[3]=i%10;
		i/=10;
	}
	
}