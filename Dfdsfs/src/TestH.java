
public class TestH {

	public static void main(String[] args) {
		
		int total=300;
		double avg=300/3.0;
		//total�̶�� ������ 300�� �ʱ�ȭ
		//avg������ 300�� 3���� ���� ���� �ʱ�ȭ

		if(avg>=90) {
			System.out.println('A');
		}
		else if(avg>=80 && avg<90) {
			System.out.println('B');
		}
		if(avg>=70) {
			System.out.println('C');
		}
		else {
			System.out.println('F');
		}
		
		//����� 90�� �̻��̸� A���
		//80�� �̻��̰� 90�� �̸��̸� B���&&
		//70�� �̻��̸� C���
		//�� �� F
	}

}
