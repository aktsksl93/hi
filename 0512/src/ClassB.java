import java.util.Scanner;

public class ClassB {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		  int sum=0;  //���պ��� 
		  int multi=1; //�Ѱ�����
		  int ary[]=new int[4];	
		  
		  for(int i=0; i<ary.length;i++) {
			  ary[i]=s.nextInt();
			  sum+=ary[i];
			  multi*=ary[i];
		  }
		System.out.println(sum);
		System.out.println(multi);

		  //4���� ������ �Է¹޾� ���հ� �Ѱ����

	}

}
