import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// ����10�� �Է¹޾� 5�ǹ�� ��� (1�����迭)
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=s.nextInt();
			if(a[i]%5==0) {
				System.out.println(a[i]);
			}
			
		}
		

	}

}
