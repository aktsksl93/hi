
public class classG {

	public static void main(String[] args) {

		int ary[][] = {{90, 90, 110, 110},{120,110,100,110},{120,140,130,150}};
		double sum=0;
		//Æò±Õ Ãâ·Â
		int cnt=0;
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {
				sum+=ary[i][j];
				cnt++;
			}
		}
		System.out.println(sum/cnt);
	}

}
