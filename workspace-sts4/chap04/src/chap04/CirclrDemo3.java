package chap04;

class Circle03{
	private double rad; // private ����� ����������� �ش� Ŭ���� �������� ��� ������.
	double radius;//Circle �� ��� ����
	//��� ������ ��� �޼��忡 ���� �����ڸ� private�� �����ϸ� �ܺο��� ������ �Ұ�����
	// ������ ��Ŭ���ؼ� Refactor ���� getter setter �ڵ����� �������ִ� Encapsule �ɼ��� ����
//	
//	public double getRad(){//private�� ��� rad�� �ܺο��� �������� ���ִ� getter()
//		return rad;
//	}
//	public void setRad(double value) {//private�� ��� rad�� �ܺο��� �����Ҽ��ְ� ���ִ� setter();
//		rad = value;
//	}
//	
	double findArea() {//Circle�� ��� �޼���(�Լ�)
		return 3.14*radius*radius;
	}
	
	void show(double x, double y) {
		System.out.printf("������ = %.1f, ���� = %.1f\n", x,y);
	}

	double getRad() {
		return rad;
	}

	void setRad(double radius) {
		this.rad = radius;
	}
	double findArea2() {//Circle�� ��� �޼���(�Լ�)
		return 3.14*rad*rad;
	}
}

public class CirclrDemo3 {

	public static void main(String[] args) {
		
		Circle03 myCircle = new Circle03();
		myCircle.radius=10.0;//Circle03 Ŭ������ �������� �ϴ°�.
		//���� ���� �Է��ϴ� �����̱� ������ �Է��� ���� ��Ȯ���� ������ �� ����
		//�߿��� ��� ����, ��� �޼����� ���� �ܺη� �����Ű�� �ʰ�, getter, setter ���� ���Ͽ� �����͸� �Է��ϰ� �������� ����� �����
		myCircle.show(myCircle.radius, myCircle.findArea());
		myCircle.setRad(12.0);//setter�� ���� Circle03�� �մ� private double Rad �� 12�� ����.
		double myrad = myCircle.getRad();//getter�� ���� Circle03�� �ִ� private double Rad�� ������
		myCircle.show(myrad, myCircle.findArea2());
	}
}
