
public class Test4 {

	public static void main(String[] args) {
		
		int age=30;
		double ki=177.7;
		String name="jack";
		char grade='A';
		
		System.out.printf("���̴� %d�̰�, �����Դ�%.1f�̰�, �̸���%s�̰�, ������ %c", age, ki, name, grade);

		int a=5, b;
		b=a++;
		//b�� ����?
		System.out.println(b); //b=5 a=6
		
		b=++a; //a=7 b=7
		System.out.println(b);
		
		int eng=100, kor=95;
		double avg=(eng+kor)/2;
		//=double avg=(double)(eng+kor);
		//�Ҽ��� ù°�ڸ����� ���
		System.out.printf("%.1f",avg);
	}

}
