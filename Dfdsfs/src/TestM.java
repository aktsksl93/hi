import java.util.Scanner;

public class TestM {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("���� ��������?");

		String day=s.next();
		//���� �Է��� ������ �������� �ν�
		switch(day) {
		case "������":
			System.out.println("��");
			break;
		case "ȭ����":
			System.out.println("ȭ");
			break;
		default: //=else
			System.out.println("��,ȭ �ƴ�");
			break;
		}
	}

}
