
public class classC {

	public static void main(String[] args) {

		int ary[][]= {{1,2,3,4},{5,6,7,8}};//2행4열
		int ary1[][]= new int[4][2];//4행2열
		
		//ary의 데이터를 ary1에 복사(위치는 다름)
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				ary1[j][i]=ary[i][j];
			}
		}
		//4행2열 ary1에 저장되어 있는 데이터 다 출력
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(ary1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
