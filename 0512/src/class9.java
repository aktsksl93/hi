import java.util.Scanner;

public class class9 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int arr[] = new int[7];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		System.out.println(sum);
		// ����Ʈ ������ �ִ� �ο����� �Է��ϰ� ������ ���Ͽ���(7��)

	}

}
