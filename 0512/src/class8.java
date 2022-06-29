import java.util.Scanner;

public class class8 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		/*int ary[]=new int[5];
		
		int size=ary.length;	//배열명,length
		System.out.println(size);*/

		//정수 5개 입력해서 평균구하기
		//length필드 사용해서
		
		int ary[]=new int[5];
		int sum=0;
		
		for(int i=0;i<ary.length;i++) {
			ary[i]=s.nextInt(); //실수를 3번입력함
			sum+=ary[i];
		}
		System.out.println("평균"+(double)(sum)/ary.length);
		//(double)(sum)=합계/ary.length=5(개수), 
	}
}
