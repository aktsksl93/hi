package day1026.sample.app;

public class VariableEx {

	public static void main(String[] args) {
	    boolean power = true;
	    boolean power2 =false;
	    
	    System.out.println(power);
	    System.out.println(power2);
	    
	    int i = 10;
	    long ¤Ó = 100;
	    
	    long i2 = 1234567890123L;
	    System.out.println("i2 : "+i2);
	    
	    char c = 'A';
	    char c2 = 65 + 1;
	    
	    System.out.println("c = "+c);
	    System.out.println("c2 = "+c2);
	    
        double d = 3.14;
        float f = 3.14f;
        
        double d2 = 0.100000000000001;
        float f2 = 0.100000000000001f;
        System.out.println("d2 = "+d2);
        System.out.println("f2 = "+f2);
        
        final double PI = 3.14;
        //PI = 3.15; ¿¡·¯
        
	}

}
