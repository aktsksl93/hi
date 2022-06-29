
public class TestJ {

	public static void main(String[] args) {

		int age=25, kg=60;
		char size;
		
		if(age<20) {
			if(kg<50)
				size='S';
			else if(kg<60)
				size='M';
			else
				size='L';
		}
		else { //age>=20
			if(kg<60)
				size='S';
			else if(kg<70)
				size='M';
			else
				size='L';
		}
		System.out.println(size);		
	}

}
