import java.util.Scanner;

public class class8 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		/*int ary[]=new int[5];
		
		int size=ary.length;	//�迭��,length
		System.out.println(size);*/

		//���� 5�� �Է��ؼ� ��ձ��ϱ�
		//length�ʵ� ����ؼ�
		
		int ary[]=new int[5];
		int sum=0;
		
		for(int i=0;i<ary.length;i++) {
			ary[i]=s.nextInt(); //�Ǽ��� 3���Է���
			sum+=ary[i];
		}
		System.out.println("���"+(double)(sum)/ary.length);
		//(double)(sum)=�հ�/ary.length=5(����), 
	}
}
