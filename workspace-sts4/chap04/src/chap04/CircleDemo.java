package chap04;

public class CircleDemo {

	static double radius; // CircleDemo Ŭ������ ��� ���� radius
	
	static double FindArea() {//CircleDemo Ŭ������ ��� �޼��� FindArea()
		return 3.14 * radius * radius;
	}
	
	static void show(double x, double y) {//CircleDemo Ŭ���� ���� ��� �޼��� show(double x, double y)
		System.out.printf("������ = %.1f, ���� = %.1f\n", x,y);
	}
	
	static void test() {
		
	}
	
	public static void main(String[] args) {
		radius = 10.0;//���� Ŭ���� ���� �ִ� ��� ������ ������ �ν��Ͻ�ȭ �����൵ ��
		
		double area = FindArea();//���� Ŭ���� ���� �ִ� �޼����� FindArea()�� ������� area��� ���������� ����
		
		show(radius, area);//���� Ŭ���� ���� �ִ� �޼����� show(double x, double y)�� ������.
		test();
		TestClass ts = new TestClass();
		ts.test();

	}

}

	class TestClass {
		int xx = 10;
		int yy = 20;
		
		void test() {
			int xx = 1000;//���������� Ŭ���� ��������� ���� ������ ����
			int yy = 2000;
			//�̷��� ���������� ���� �켱����ȴ�. �켱���� �� ���� ����
			//�̶� Ŭ���� ��� ������ ȣ���Ͽ� ����Ϸ��� this Ű���带 ����ؾ���
			//this = ��ü �ڱ� �ڽ��� �ǹ��ϴ� Ű����
			System.out.println("���� xx �� �� : "+xx+", ���� yy�� �� : "+yy);
			System.out.println("Ŭ������� ���� xx�� �� : "+this.xx+", Ŭ������� ���� yy�� �� : "+this.yy);
		}
	}