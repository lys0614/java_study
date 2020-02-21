package chap04;

class Circle4{
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle4(double r) {// 생성자, 객체 생성시 멤버 변수의 초기화를 담당함. 생성자도 메서드임
		radius = r;
	}
	double findArea() {//Circle의 멤버 메서드(함수)
		return 3.14*radius*radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x,y);
	}
}

public class CircleDemo4 {

	public static void main(String[] args) {
		
		Circle4 myCircle = new Circle4(10.0);//생성자 메서드인 Circle4(double r)을 실행해주는 부분
		System.out.println(myCircle.getRadius());
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}

}
