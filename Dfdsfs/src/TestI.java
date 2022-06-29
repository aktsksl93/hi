
public class TestI {
	public static void main(String[] args) {
		
		int a=20,b=10;
		
		if(a>10) { //선행 조건 바깥쪽 if문 조건이 참이어야 안쪽 if~else확인 가능
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
