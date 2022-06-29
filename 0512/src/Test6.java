import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// 정수10개 입력받아 5의배수 출력 (1차원배열)
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=s.nextInt();
			if(a[i]%5==0) {
				System.out.println(a[i]);
			}
			
		}
		

	}

}
