import java.util.Scanner;

public class TestP {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("���� �Է�:");
		int age=s.nextInt();
		//switch���� ���� ������� case���� ��������Ѵ�!!
		switch(age%2) {
		case 1:
			System.out.println("���̰� Ȧ��");
			break;
		case 0:
			System.out.println("���̰� ¦��");
			break;
		}
	}

}
/*switch(age>2) {
case true:
	System.out.println("���̰� Ȧ��");
	break;
case false:
	System.out.println("���̰� ¦��");
	break;
}*/
