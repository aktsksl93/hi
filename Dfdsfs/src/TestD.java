import java.util.Scanner;

public class TestD {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("수 입력");

		int n=s.nextInt();
		//입력한 수가 9의 배수인지 알아보고싶다.
		
		if(n%9==0) {//n을 9로 나눴을때 나머지가 0이라는 건 n이 9의배수라는 뜻
			System.out.println("9의 배수이다");
		}
		else {// n%9!=0
			System.out.println("9의 배수가 아니다");
		}
	}

}
