
public class TestI {
	public static void main(String[] args) {
		
		int a=20,b=10;
		
		if(a>10) { //���� ���� �ٱ��� if�� ������ ���̾�� ���� if~elseȮ�� ����
			if(b>=0) {
				b=1;
			}
			else { //b<0
				b=-1;
			}
		}
		else { //a<=10
			if(b>=0) {
				b=1;
			}
			else { //b<0
				b=-1;
			}
		}
		System.out.println(a+" "+b);
	}

}
