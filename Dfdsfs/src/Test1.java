import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("나이, 체중, 이름, 학점을 입력해라");
		
		int age=s.nextInt(); //스캐너 객체로부터 정수를 입력해 age변수에 대입(저장)
		double kg=s.nextDouble(); //스캐너 객체로부터 실수를 입력해 kg변수에 대입(저장)
		String name=s.next();//nextline
		float ki=s.nextFloat();
		char grade=s.next().charAt(0);
		//charAt(문자열인덱스)	ABCDE "1이나 2를 입력하면 한글자만 뜨므로 0을 써야함"
	
		System.out.println(age +" "+kg+" "+name+" "+ki+" "+grade);
	}

}
