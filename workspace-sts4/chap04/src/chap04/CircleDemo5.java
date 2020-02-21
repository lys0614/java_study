package chap04;

public class CircleDemo5 {
	public CircleDemo5(){
		//사용자가 만든 기본 생성자
		this(10.0, "빨강");//this()를 통해 생성자 안에서 또다른 생성자를 호출함
		//매개변수가 10.0과 "빨강" 인 CircleDemo5 생성자를 실행한것.
		new CircleDemo5(10.0, "빨강");
	}
	
	public CircleDemo5(String color) {
		this(10.0, color);
		//매개변수 color를 받아서 CircleDemo5(10.0, color) 생성자를 실행한것
	}
	public CircleDemo5(double radius) {
		this(radius, "빨강");
		//매개변서 radius를 받아서 CircleDemo5(radius, "빨강")생성자를 실행한것
	}
	public CircleDemo5(double radius, String color) {//source -> generate Constructors using fields 써서 만듦.
		//필드에 있는 멤버변수를 사용하는 생성자를 만들어주는 옵션임.
		this.radius = radius;
		this.color = color;
	}
	
	public void show() {
		System.out.printf("반지름 : %.1f , 색상 : %s\n", radius, color);
	}
	double radius;
	String color;

}
