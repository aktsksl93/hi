import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("점수 입력해");
		int score=s.nextInt();
		if(score>=80) {
			System.out.println("합격");
		}
	}

}
