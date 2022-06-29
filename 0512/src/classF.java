
public class classF {

	public static void main(String[] args) {

		String s[][]= {{"java"},{"c","c++"},{"html","css","python"}};
		//비정방형 배열
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				System.out.println(s[i][j]);
			}
		}	
	}
}
