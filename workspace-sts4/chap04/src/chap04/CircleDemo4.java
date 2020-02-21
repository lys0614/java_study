package chap04;

class Circle4{
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle4(double r) {// ������, ��ü ������ ��� ������ �ʱ�ȭ�� �����. �����ڵ� �޼�����
		radius = r;
	}
	double findArea() {//Circle�� ��� �޼���(�Լ�)
		return 3.14*radius*radius;
	}
	
	void show(double x, double y) {
		System.out.printf("������ = %.1f, ���� = %.1f\n", x,y);
	}
}

public class CircleDemo4 {

	public static void main(String[] args) {
		
		Circle4 myCircle = new Circle4(10.0);//������ �޼����� Circle4(double r)�� �������ִ� �κ�
		System.out.println(myCircle.getRadius());
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}

}
