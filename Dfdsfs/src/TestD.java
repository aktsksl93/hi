import java.util.Scanner;

public class TestD {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("�� �Է�");

		int n=s.nextInt();
		//�Է��� ���� 9�� ������� �˾ƺ���ʹ�.
		
		if(n%9==0) {//n�� 9�� �������� �������� 0�̶�� �� n�� 9�ǹ����� ��
			System.out.println("9�� ����̴�");
		}
		else {// n%9!=0
			System.out.println("9�� ����� �ƴϴ�");
		}
	}

}
