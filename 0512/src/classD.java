import java.util.Scanner;

public class classD {

	public static void main(String[] args) {
		// 2행3열에 정수를 입력해 입력한 정수 총합출력
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
