import java.util.Scanner;

public class classI {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String a=s.next();
		String b=s.next();
		
		if(a.length()<b.length()) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}
	}

}
