
public class TestH {

	public static void main(String[] args) {
		
		int total=300;
		double avg=300/3.0;
		//total이라는 변수에 300을 초기화
		//avg변수에 300을 3으로 나눈 값을 초기화

		if(avg>=90) {
			System.out.println('A');
		}
		else if(avg>=80 && avg<90) {
			System.out.println('B');
		}
		if(avg>=70) {
			System.out.println('C');
		}
		else {
			System.out.println('F');
		}
		
		//평균이 90점 이상이면 A출력
		//80점 이상이고 90점 미만이면 B출력&&
		//70점 이상이면 C출력
		//그 외 F
	}

}
