package day1026.sample.app;

public class ConversionEx1 {

	public static void main(String[] args) {
		byte b1 = 10;
		int i1 = b1;
		
		System.out.println("b1 = "+b1);
		System.out.println("i1 = "+i1);
		
		int i2 = 300;
		byte b2 = (byte)i2;//������ �ս��� �߻��ϴ��� byte�� ��ȯ
		
		System.out.println("b2 = "+b2);
		System.out.println("i2 = "+i2);
	}

}
