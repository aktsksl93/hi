import java.util.Scanner;

public class TestA {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("�̸�, ��� ��, ����, ü��");
		
		String name=s.next();
		String live=s.next();
		int age=s.nextInt();
		double weight=s.nextDouble();
		
		System.out.println("�̸� : "+name+",��� ��: "+live+", ����: "+age+", ü��: "+weight+"�Դϴ�");

	}

}

/*Scanner s=new Scanner(System.in);
System.out.println("�̸�,��� ��, ����, ü���� �ۼ��϶�");

String name=s.next();
String live=s.next();
int age=s.nextInt();
double weight=s.nextDouble();

System.out.println("�̸� : "+name +","+"��� �� : "+live+"���� : "+age+"ü��: "+weight);*/
