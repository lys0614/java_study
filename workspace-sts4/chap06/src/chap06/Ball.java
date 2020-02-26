package chap06;

public class Ball extends Circle{

	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "공이다");
	}
	
	public void findVolume() {
		System.out.println("부피는 4/3(파이*반지름*반지름*반지름) 이다");
	}
	
	//오버라이딩 = 부모클래스로부터 사옥받은 메서드의 내용을 수정하여 사용하는것
	//부모클래스의 메서드 형식은 100% 동일하게 입력해야 하며, 실행코드는 자식클래스에 맞게 수정해서 사용한다
	@Override // <- Annotation = 특정 효과가 있다고 알려주는 기능
	//오버라이딩 규칙과 틀릴 경우 오류메시지르 띄워줌
	public void findArea() {
		//부모클래스에 있는 형식 그대로 가져와서 써야함
		findRadius();
		super.findArea();
		System.out.println("넓이는 4*(파이*반지름*반지름)이다");
	}
	
	
}
