import java.util.Scanner;

public class TestO {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("�ϳ��� ���ڸ� �Է��ض�");
		
		String ch=s.next();
		switch(ch) {
		case "m":
			System.out.println("movie");
			break;
		case "s":
			System.out.println("sing");
			break;
		case "b":
			System.out.println("book");
			break;
		default:
			System.out.println("etc");			
		}

	}

}
/*
 * �ϳ��� ���ڸ� �Է¹޾�
 * m - movie
 * s - sing
 * b - book
 * �׿ܴ� etc��� ���
 */