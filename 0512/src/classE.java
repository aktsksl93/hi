
public class classE {

	public static void main(String[] args) {

		/*int ary[]=new int[5];
		int n=ary.length;	//�迭 ����
		System.out.println(n);*/

		int ary[][]=new int[2][5];
		
		int n=ary.length;
		System.out.println(n);//2���� �迭�� ���� ����(�迭��.length)
		
		int m=ary[0].length;
		System.out.println(m);//2���� �迭�� ���� ����(�迭��[0].length)
								//���� 0�϶� ���� ����
	}//�迭��.length-���� ����
	 //�迭��[���� �ε���].length-���ǰ���
}
