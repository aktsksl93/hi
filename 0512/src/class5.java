import java.util.Scanner;

public class class5 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		double a[]=new double[5];
		int sum=0;
		
		for(int i=0;i<5;i++) {
			a[i]=s.nextDouble(); //a[0] a[1] a[2] a[3] a[4]
			sum+=a[i];//입력한 실수를 다 더하겠다
		}//실수를 입력해 배열에 저장
		// 실수형 5개배열생성
		System.out.println("입력한 수의 평균"+sum/5.0);

	}

}
