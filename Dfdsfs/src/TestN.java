import java.util.Scanner;

public class TestN {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("학점을 입력해라");
		String ch=s.next();
		
		switch(ch) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bad");
			break;
			//C,D Good
			//F Bad
			
		}

	}

}

