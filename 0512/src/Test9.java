import java.util.Scanner;
public class Test9 {

	public static void main(String[] args) {
		//1
		int i=1;
		int sum=0;
		
		while(i<=100) {
			if(i%5==0 && i%6==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		
		
		//2
		
		
		int i = 0;		
		int sum = 0;
		
		do {
			i=i+5;
			if(i%5==0 && i%10==0) {
				sum+=i;
			}	
		} while (i<=100);
				
		System.out.println(sum);
		
		//3
		int sum=0;
			for(int i=0;i<=100;i++) {
				if(i%5==0 && i%10==0) {
					sum+=i;
				}
			}System.out.println(sum);
	}

}
