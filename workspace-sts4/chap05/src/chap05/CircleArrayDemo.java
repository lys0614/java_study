package chap05;

public class CircleArrayDemo {

	public static void main(String[] args) {
	
		
		Circle c1 = new Circle(10.0);
		
		Circle circles[] = new Circle[5];
		for(int i=0;i<circles.length;i++) {
			circles[i] = new Circle(i + 1.0);
			System.out.printf("원의 넓이(반지름%.1f) = %.2f\n",circles[i].getRadius(), circles[i].findArea());
		}
		
	}
	
}

class Circle{
	double radius;//Circle클래스 필드에있는 멤버 변수
	
	public Circle(double radius) {//매개변수 받는 생성자
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	double findArea() {
		return 3.14*radius*radius;
	}
	
	
	
	
	
}