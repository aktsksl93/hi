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
		int n; //�Է��ϴ� ��
		Scanner s=new Scanner(System.in);
		
		while((n=s.nextInt())!=0) {
			sum+=n;
			count++;
		}
		System.out.println("�����"+sum/(double)count);
		

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

		char a[] = new char[10];//10���� ���ڸ� ������ �迭 a�� �����ϰ� �����ض�.

		//4-2) 0~4���� ���������� �ʱ�ȭ�� �迭 b�� �����ϰ� �����ض�.
		int b[] = {0,1,2,3,4};

		//4-3) ��java��, ��c��, ��c++���� �ʱ�ȭ�� �迭 c�� �����ϰ� �����ض�.
		String c[] = new String[] {"java","c","c++"};

		//4-4) �ε����� �ִ밪�� 9�� ������ �迭 d�� �����ϰ� �����ض�.
		int d[] = new int[10];

		
/*1.	1~10���� ���� ���ض�. (for, while, do~while)

2.	while���� �̿��Ͽ� ������ ���� �� �Է¹ް� ��� ����ض�. (0�� �ԷµǸ� �Է��� ����ȴ�.)

3.	���� while���� ���� �������� �����ϰ� �������� 2���� �������� �ٲ��.
int i=0;,sum=0;
while( i<10){
i=i+2;
sum +=i;
}
System.out.println(sum);

    3.1) while(true)�� break�� ����Ͽ� �ٲ��.
    3.2) do~while��, continue�� ����Ͽ� �ٲ��.

4-1) 10���� ���ڸ� ������ �迭 a�� �����ϰ� �����ض�.
4-2) 0~4���� ���������� �ʱ�ȭ�� �迭 b�� �����ϰ� �����ض�.
4-3) ��java��, ��c��, ��c++���� �ʱ�ȭ�� �迭 c�� �����ϰ� �����ض�.
4-4) �ε����� �ִ밪�� 9�� ������ �迭 d�� �����ϰ� �����ض�.*/
