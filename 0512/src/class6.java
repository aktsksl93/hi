import java.util.*;

public class class6 {

	public static void main(String[] args) {
		// 큰 값 출력
		Scanner s=new Scanner(System.in);
		
		int ary[]=new int[5];
		int max=0;
		
		for(int i=0;i<5;i++) {
			ary[i]=s.nextInt(); //정수입력받아 배열에 저장
			if(ary[i] > max) {
				max=ary[i];
			}
			
		}
		System.out.println("가장 큰 수는"+max);
	}

}
