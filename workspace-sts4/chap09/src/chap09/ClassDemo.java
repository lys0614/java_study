package chap09;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Keyboard k = new Keyboard("logitech");
		
		Class c = k.getClass();//��ü k�� Ŭ������ �����ͼ� ClassŸ���� c�� ����
		
		
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
	}


}
