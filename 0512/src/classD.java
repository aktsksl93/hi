import java.util.Scanner;

public class classD {

	public static void main(String[] args) {
		// 2��3���� ������ �Է��� �Է��� ���� �������
		Scanner s=new Scanner(System.in);
		
		int ary[][]= new int[2][3];
		int sum=0;
			for(int i=0;i<2;i++) {
				for(int j=0;j<3;j++) {
					ary[i][j]=s.nextInt();
					sum+=ary[i][j];
				}
			}
		
		System.out.println(sum);

	}

}
