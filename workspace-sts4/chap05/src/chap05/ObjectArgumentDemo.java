package chap05;

public class ObjectArgumentDemo {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);
		zero(c1);
		System.out.println("�� (c1)�� ������ : "+c1.radius);
		
		zero(c2.radius);
		System.out.println("�� (c2)�� ������ : "+c2.getRadius());

	}
	
	
	public static void zero(Circle c) {
		c.radius = 0.0;
	}
	
	public static void zero(double r) {
		r = 0.0;
	}

}