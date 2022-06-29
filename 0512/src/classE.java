
public class classE {

	public static void main(String[] args) {

		/*int ary[]=new int[5];
		int n=ary.length;	//배열 개수
		System.out.println(n);*/

		int ary[][]=new int[2][5];
		
		int n=ary.length;
		System.out.println(n);//2차원 배열의 행의 개수(배열명.length)
		
		int m=ary[0].length;
		System.out.println(m);//2차원 배열의 열의 개수(배열명[0].length)
								//행이 0일때 열의 개수
	}//배열명.length-행의 개수
	 //배열명[행의 인덱스].length-열의개수
}
