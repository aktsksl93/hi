import java.util.Scanner;

public class TestK {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("���� �Է�:");
		int score= s.nextInt();
		
		System.out.println("�г� �Է�:");
		int year= s.nextInt();
		//������ 60�� �̻��̸鼭 �г��� 3�г��� �ƴϸ� �հ�
		if(score>=60) {
			if(year!=3) {
				System.out.println("�հ�");
			}
			else if(score>=70) { //3�г��̸鼭 70���̻��϶�
				System.out.println("�հ�");
			}
			else { //3�г��� 70���̸��϶�
				System.out.println("���հ�");
			}
		}else { //������ 60�� �̸��϶�
			System.out.println("���հ�");
		}
	}

}
