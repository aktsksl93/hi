
public class Test3 {

	public static void main(String[] args) {

		int sum=0;
		int ary[]= {1,2,3,4,5};
		
		for(int i:ary) {//순차적으로 대입
			sum+=i;
		}
		System.out.println(sum);
		
		String str[] = {"컴퓨터","자바","DB"};
		
		for(String s:str) {
			System.out.println(s);
		}
	}
}//p218 p202

