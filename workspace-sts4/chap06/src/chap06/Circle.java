package chap06;

public class Circle {

	private void secret() {
		//private는 클래스 내에서만 접근을 허용한다.
		//그래서 상속이 안된다
		System.out.println("비밀");
	}
	
	protected void findRadius() {
		//접근제한자 protected 는 부모-자식 사이에서만 접근을 허용한다.
		//상속 가능
		System.out.println("반지름 10.0센티");
	}
	
	public void findArea() {
		//모든 클래스에서 접근 가능
		//상속 가능
		System.out.println("넓이는 (파이*반지름*반지름)이다");
	}
	
}
