import java.util.Scanner;

public class TestA {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("이름, 사는 곳, 나이, 체중");
		
		String name=s.next();
		String live=s.next();
		int age=s.nextInt();
		double weight=s.nextDouble();
		
		System.out.println("이름 : "+name+",사는 곳: "+live+", 나이: "+age+", 체중: "+weight+"입니다");

	}

}

/*Scanner s=new Scanner(System.in);
System.out.println("이름,사는 곳, 나이, 체중을 작성하라");

String name=s.next();
String live=s.next();
int age=s.nextInt();
double weight=s.nextDouble();

System.out.println("이름 : "+name +","+"사는 곳 : "+live+"나이 : "+age+"체중: "+weight);*/
