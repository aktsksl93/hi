import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("����, ü��, �̸�, ������ �Է��ض�");
		
		int age=s.nextInt(); //��ĳ�� ��ü�κ��� ������ �Է��� age������ ����(����)
		double kg=s.nextDouble(); //��ĳ�� ��ü�κ��� �Ǽ��� �Է��� kg������ ����(����)
		String name=s.next();//nextline
		float ki=s.nextFloat();
		char grade=s.next().charAt(0);
		//charAt(���ڿ��ε���)	ABCDE "1�̳� 2�� �Է��ϸ� �ѱ��ڸ� �߹Ƿ� 0�� �����"
	
		System.out.println(age +" "+kg+" "+name+" "+ki+" "+grade);
	}

}
