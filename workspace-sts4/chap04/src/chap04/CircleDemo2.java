package chap04;

public class CircleDemo2 {

	public static void main(String[] args) {

		Circle circle = new Circle();// 동일한 클래스 내에 있는게 아니므로 사용을 위해 인스턴스화
		circle.radius = 10.0;//객체의 멤버 변수에 접근하기 위해서 .을 사용
		circle.show(circle.radius, circle.findArea());
		

	}

}

class Circle{
	double radius;
	final double PI = 3.14;//상수 선언문
	double findArea() {
		return PI*radius*radius;
	}
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f , 넓이 = %.1f\n", x,y);
	}
}