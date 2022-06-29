import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("두 정수 입력");
		
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("%.2f", (a+b)/2.0);
		// 두 정수를 입력받아 평균 출력하는 프로그램 (소수점 둘쨰자리까지)

	}

}
