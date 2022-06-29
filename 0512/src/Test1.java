
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
//for-each문: 배열의 각 요소를 순차적으로 접근한다.
//for(int i:num)