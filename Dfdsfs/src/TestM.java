import java.util.Scanner;

public class TestM {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("무슨 요일이죠?");

		String day=s.next();
		//내가 입력한 요일을 조건으로 인식
		switch(day) {
		case "월요일":
			System.out.println("월");
			break;
		case "화요일":
			System.out.println("화");
			break;
		default: //=else
			System.out.println("월,화 아님");
			break;
		}
	}

}
