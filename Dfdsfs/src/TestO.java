import java.util.Scanner;

public class TestO {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("하나의 글자를 입력해라");
		
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
 * 하나의 글자를 입력받아
 * m - movie
 * s - sing
 * b - book
 * 그외는 etc라고 출력
 */