import java.util.Scanner;

public class TestF {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char grade; //�ѱ��� ����
		
		System.out.println("���� �Է�");
		int score=s.nextInt();
		
		if(score>=90) {
			grade='A';
		}
		else if(score>=80) //80<=score<90
			grade='B';
		else if(score>=70)
			grade='C';
		else
			grade='F';
		System.out.println("���� : " +grade);

	}

}
