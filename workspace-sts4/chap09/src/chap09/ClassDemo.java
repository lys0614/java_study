package chap09;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Keyboard k = new Keyboard("logitech");
		
		Class c = k.getClass();//객체 k의 클래스를 가져와서 Class타입의 c에 저장
		
		
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
	}


}
