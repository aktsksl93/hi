
public class Test4 {
	// 2���� �迭: ��� int ary[][]=new int[2][5]; //2��5��
	public static void main(String[] args) {
		// �ϳ��� ���� 5�� 5������
		//�Ǽ��� 5�� 2������
		char a[][]=new char[5][5];
		double b[][]=new double[5][2];
		
		int c[][]= {{1,2,3},
					{4,5,6}};
		
		for(int i=0;i<2;i++) {//0,1
			for(int j=0;j<3;j++) {
				System.out.println(c[i][j]);
			}
		}
		/*c[0][0]=1;
		 *c[0][1]=2;
		 *c[0][2]=3;
		 *c[1][0]=4;
		 *c[1][1]=5;
		 *c[1][2]=6;
		 */
		
	}

}
