import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		//실수형 2차원 2행 3열구조
		double ary[][]=new double[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				ary[i][j]=s.nextDouble();	
				System.out.println(ary[i][j]);
			}
		}
	/*	0 0
		0 1
		0 2
		1 0
		1 1
		1 2 */
	}

}
