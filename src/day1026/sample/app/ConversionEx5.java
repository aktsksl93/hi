package day1026.sample.app;

public class ConversionEx5 {

	public static void main(String[] args) {
	
		double d =100;
		int i = 100;
		double result = i+d;
		int r2 = i + (int)d;
		//double -> int 소수점부터 다 사라짐(버림)
		int r3 = (int)(i+d);
		
		System.out.println("d = "+d);
		//변수 d에 
		System.out.println("i = "+i);
		System.out.println("result = "+result);
	}

}
