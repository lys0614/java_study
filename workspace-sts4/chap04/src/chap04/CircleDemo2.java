package chap04;

public class CircleDemo2 {

	public static void main(String[] args) {

		Circle circle = new Circle();// ������ Ŭ���� ���� �ִ°� �ƴϹǷ� ����� ���� �ν��Ͻ�ȭ
		circle.radius = 10.0;//��ü�� ��� ������ �����ϱ� ���ؼ� .�� ���
		circle.show(circle.radius, circle.findArea());
		

	}

}

class Circle{
	double radius;
	final double PI = 3.14;//��� ����
	double findArea() {
		return PI*radius*radius;
	}
	void show(double x, double y) {
		System.out.printf("������ = %.1f , ���� = %.1f\n", x,y);
	}
}