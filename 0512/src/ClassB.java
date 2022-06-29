import java.util.Scanner;

public class ClassB {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		  int sum=0;  //ÃÑÇÕº¯¼ö 
		  int multi=1; //ÃÑ°öº¯¼ö
		  int ary[]=new int[4];	
		  
		  for(int i=0; i<ary.length;i++) {
			  ary[i]=s.nextInt();
			  sum+=ary[i];
			  multi*=ary[i];
		  }
		System.out.println(sum);
		System.out.println(multi);

		  //4°³ÀÇ Á¤¼ö°ª ÀÔ·Â¹Þ¾Æ ÃÑÇÕ°ú ÃÑ°öÃâ·Â

	}

}
