package day1026.sample.app;

public class ConversionEx5 {

	public static void main(String[] args) {
	
		double d =100;
		int i = 100;
		double result = i+d;
		int r2 = i + (int)d;
		//double -> int �Ҽ������� �� �����(����)
		int r3 = (int)(i+d);
		
		System.out.println("d = "+d);
		//���� d�� 
		System.out.println("i = "+i);
		System.out.println("result = "+result);
	}

}
