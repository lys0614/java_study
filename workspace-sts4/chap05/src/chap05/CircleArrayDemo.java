package chap05;

public class CircleArrayDemo {

	public static void main(String[] args) {
	
		
		Circle c1 = new Circle(10.0);
		
		Circle circles[] = new Circle[5];
		for(int i=0;i<circles.length;i++) {
			circles[i] = new Circle(i + 1.0);
			System.out.printf("���� ����(������%.1f) = %.2f\n",circles[i].getRadius(), circles[i].findArea());
		}
		
	}
	
}

class Circle{
	double radius;//CircleŬ���� �ʵ忡�ִ� ��� ����
	
	public Circle(double radius) {//�Ű����� �޴� ������
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	double findArea() {
		return 3.14*radius*radius;
	}
	
	
	
	
	
}