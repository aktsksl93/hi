import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		int ary[]=new int[10];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<ary.length;i++) {
			ary[i]=s.nextInt();
			if(ary[i]%5==0) {
				System.out.println(ary[i]);
			}
		}//1	4 5 3
	}

}
