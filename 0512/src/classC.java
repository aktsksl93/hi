
public class classC {

	public static void main(String[] args) {

		int ary[][]= {{1,2,3,4},{5,6,7,8}};//2��4��
		int ary1[][]= new int[4][2];//4��2��
		
		//ary�� �����͸� ary1�� ����(��ġ�� �ٸ�)
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				ary1[j][i]=ary[i][j];
			}
		}
		//4��2�� ary1�� ����Ǿ� �ִ� ������ �� ���
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(ary1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
