
public class class2 {

	public static void main(String[] args) {
		
		//int a[];// 배열에 대한 레퍼런스 변수 a를 선언
		//a new int[5];
		
		int ary[]= {1,2,3}; //배열 초기화
		System.out.println(ary[0]);
		System.out.println(ary[2]);
		
		int a[]= {4,3,2};
		System.out.println(a[0]);
		
		int b[]= new int[] {4,3,2};//초기화할땐 []안에 개수적으면 안됨
		System.out.println(b[1]);
		
		double c[]= {0.02,0.4,0.04};
		System.out.println(c[1]);
		
	}
}
