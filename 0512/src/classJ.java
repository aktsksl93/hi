import java.util.Scanner;

public class classJ {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String a="apple";
		String b="banana";
		
		if(a.compareTo(b)>0) { //a>b a�� b���� ���߿� ����
			System.out.println(a);
		}
		else if(a.compareTo(b)<0){ //b�� a���� ���߿� ����
			System.out.println(b);
		}
		else //a.compareTo(b)==0(0�̸� ���� ���ڿ�)
			System.out.println("���� ���ڿ�!");

	}

}
