package chap06;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		//Ŭ���� Circle �� ���
		Circle c = new Circle();
		//Ŭ���� Ball ���, Circle Ŭ������ ��ӹ��� Ŭ���� Ball
		Ball b = new Ball("������");
		
		//c�� private�� ����� secret()�޼��带 ������ findRadius(), findArea() �޼��带 ����� �� �ִ�.
		System.out.println("�� : ");
		c.findRadius();
		c.findArea();

		//b�� CircleŬ������ ��ӹ޾Ƽ� findRadius(), findArea()�� ����� �� �ְ�, Ball Ŭ������ �ִ� findColor(), findVolume()�޼��嵵 ����� �� �ִ�.
		System.out.println("\n�� : ");
		b.findRadius();
		b.findColor();
		b.findArea();
		b.findVolume();
		
	}

}
