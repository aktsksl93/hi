
public class Test5 {

	public static void main(String[] args) {
		String name="연운";
		int age=20;
		double ki=166.6;
		char blood='O';
		
		System.out.printf("%s, %d, %.1f, %c", name, age, ki, blood);
		//연운의 나이는 20살이다.
		System.out.println(name+"의 나이는 "+age+"살이다");
		//연운의 혈액형은 O형
		System.out.println(name+"의 혈액형은 "+blood+"형");
		
		System.out.println((int)(6+2.5));
		System.out.println((int)(8.5)+0.5);
	}

}
