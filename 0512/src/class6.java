import java.util.*;

public class class6 {

	public static void main(String[] args) {
		// ū �� ���
		Scanner s=new Scanner(System.in);
		
		int ary[]=new int[5];
		int max=0;
		
		for(int i=0;i<5;i++) {
			ary[i]=s.nextInt(); //�����Է¹޾� �迭�� ����
			if(ary[i] > max) {
				max=ary[i];
			}
			
		}
		System.out.println("���� ū ����"+max);
	}

}
