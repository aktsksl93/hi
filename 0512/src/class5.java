import java.util.Scanner;

public class class5 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		double a[]=new double[5];
		int sum=0;
		
		for(int i=0;i<5;i++) {
			a[i]=s.nextDouble(); //a[0] a[1] a[2] a[3] a[4]
			sum+=a[i];//�Է��� �Ǽ��� �� ���ϰڴ�
		}//�Ǽ��� �Է��� �迭�� ����
		// �Ǽ��� 5���迭����
		System.out.println("�Է��� ���� ���"+sum/5.0);

	}

}
