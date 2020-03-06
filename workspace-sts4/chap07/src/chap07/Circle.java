package chap07;

//추상클래스를 부모 클래스로 상속받음
//추상클래스를 사용하는 이유는 부모클래스를 상속받아 사용할 자식 클래스들이 공통적으로 사용해야하는 부분을 강제(고정)하기 위해서
//상속받은 추상메서드를 구현하지 않으면 상속한 그 클래스도 추상클래스가 됨
public class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	//상속받은 추상메서드를 오버라이딩하여 사용
	public void draw() {
		System.out.println("원을 그리다");
	}
	
	public double findArea() {
		return pi*radius*radius;
	}
}
