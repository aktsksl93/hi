import java.util.Scanner;

public class TestP {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("나이 입력:");
		int age=s.nextInt();
		//switch문은 식의 결과값을 case문과 비교해줘야한다!!
		switch(age%2) {
		case 1:
			System.out.println("나이가 홀수");
			break;
		case 0:
			System.out.println("나이가 짝수");
			break;
		}
	}

}
/*switch(age>2) {
case true:
	System.out.println("나이가 홀수");
	break;
case false:
	System.out.println("나이가 짝수");
	break;
}*/
