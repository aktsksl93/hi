
public class Test1 {

	public static void main(String[] args) {
		
		int[]num= {1,2,3,4,5};
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		for(int i:num) {
			System.out.println(i);
		}
	}
}
//for-each��: �迭�� �� ��Ҹ� ���������� �����Ѵ�.
//for(int i:num)