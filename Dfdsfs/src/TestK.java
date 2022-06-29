import java.util.Scanner;

public class TestK {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("점수 입력:");
		int score= s.nextInt();
		
		System.out.println("학년 입력:");
		int year= s.nextInt();
		//점수가 60점 이상이면서 학년이 3학년이 아니면 합격
		if(score>=60) {
			if(year!=3) {
				System.out.println("합격");
			}
			else if(score>=70) { //3학년이면서 70점이상일때
				System.out.println("합격");
			}
			else { //3학년이 70점미만일때
				System.out.println("불합격");
			}
		}else { //점수가 60점 미만일때
			System.out.println("불합격");
		}
	}

}
