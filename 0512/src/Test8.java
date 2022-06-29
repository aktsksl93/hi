import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		//1
		int sum=0;
		int i=1;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println(sum);
		
		//2
		
		int sum=0;
		int count=0;
		int n; //입력하는 값
		Scanner s=new Scanner(System.in);
		
		while((n=s.nextInt())!=0) {
			sum+=n;
			count++;
		}
		System.out.println("평균은"+sum/(double)count);
		

		//3.1

		int i=0, sum=0;
		while(true) {
			i+=2;
			sum+=i;
			if(i>=10) {
				break;
			}
		}
		System.out.println(sum);

		//3.2

		int i=0,sum=0;
		do {
			if(i%2!=0//=i%2==1) {
				continue;
			}
			i++;
			sum+=i;
		}
		while(i<10);
		System.out.println(sum);


		//4.1

		char a[] = new char[10];//10개의 문자를 가지는 배열 a를 선언하고 생성해라.

		//4-2) 0~4까지 정수형으로 초기화된 배열 b를 선언하고 생성해라.
		int b[] = {0,1,2,3,4};

		//4-3) “java”, “c”, “c++”로 초기화된 배열 c를 선언하고 생성해라.
		String c[] = new String[] {"java","c","c++"};

		//4-4) 인덱스의 최대값이 9인 정수형 배열 d를 선언하고 생성해라.
		int d[] = new int[10];

		
/*1.	1~10까지 합을 구해라. (for, while, do~while)

2.	while문을 이용하여 정수를 여러 개 입력받고 평균 출력해라. (0이 입력되면 입력이 종료된다.)

3.	다음 while문을 보고 실행결과가 동일하게 나오도록 2가지 과정으로 바꿔라.
int i=0;,sum=0;
while( i<10){
i=i+2;
sum +=i;
}
System.out.println(sum);

    3.1) while(true)와 break를 사용하여 바꿔라.
    3.2) do~while문, continue을 사용하여 바꿔라.

4-1) 10개의 문자를 가지는 배열 a를 선언하고 생성해라.
4-2) 0~4까지 정수형으로 초기화된 배열 b를 선언하고 생성해라.
4-3) “java”, “c”, “c++”로 초기화된 배열 c를 선언하고 생성해라.
4-4) 인덱스의 최대값이 9인 정수형 배열 d를 선언하고 생성해라.*/
