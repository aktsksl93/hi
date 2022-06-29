import java.util.Scanner;

public class classJ {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String a="apple";
		String b="banana";
		
		if(a.compareTo(b)>0) { //a>b a가 b보다 나중에 나옴
			System.out.println(a);
		}
		else if(a.compareTo(b)<0){ //b가 a보다 나중에 나옴
			System.out.println(b);
		}
		else //a.compareTo(b)==0(0이면 같은 문자열)
			System.out.println("같은 문자열!");

	}

}
