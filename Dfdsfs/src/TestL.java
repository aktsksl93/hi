
public class TestL {

	public static void main(String[] args) {

		char grade='C';
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("Good");
			break; //탈출
		case 'C':
			System.out.println("Not bad");
			break;
		case 'F':
			System.out.println("Bad");
			break;
		}
	}
}
/*case에 상수값만 올 수 있다(문자, 문자열, 정수)
switch(식) {
	case 값:
		실행문;
		break;
}*/