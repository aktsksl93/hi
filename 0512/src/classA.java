
public class classA {

	public static void main(String[] args) {

		int ary[]=new int[10];
		//1 2 3 5 8 13 21 34 55 89 (피보나치)
		
		ary[0]=1;
		ary[1]=2;
		//1--2--3
		for(int i=0;i<8;i++) {
			ary[i+2]=ary[i]+ary[i+1];
		}
		for(int i=0;i<10;i++) {
			System.out.print(ary[i] + " ");
		}
	}
}
//ary[2]=3 ary[3]=5 