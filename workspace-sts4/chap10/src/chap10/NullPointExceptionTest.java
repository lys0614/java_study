package chap10;
class MyDate{
	int year=2035;
	int month=12;
	int day=25;	

}

public class NullPointExceptionTest {

	public static void main(String[] args) {		
		try {
			MyDate d = new MyDate();
//			MyDate d = null;
			System.out.printf("%d�� %d�� %d��\n",d.year, d.month, d.day);
		}
		catch(NullPointerException e) {
			System.out.println("�����Ͱ� null����");
		}	
	}
}
