package javaReview2;
import java.lang.Math; // �ڹ��� ���� ���� Ŭ����
public class Review5 {

	public static void main(String[] args) {
//		Rectangle rec1 = new Rectangle();
//		rec1.area1();
//		rec1.area2();
//		rec1.area4();
//		
//		MicroWaveOven oven = new MicroWaveOven();
//		oven.powerOn();
//		oven.start();
//		
//		MicroWaveOven oven1 = new MicroWaveOven(20);
//		oven1.powerOn();
//		oven1.start();
//		
//		MicroWaveOven oven2 = new MicroWaveOven('A');
//		oven2.powerOn();
//		oven2.start();
		
		//this() : Ư�� �����ڿ��� �ٸ� �����ε��� �����ڸ� ȣ���ϴ� ��ɾ�
//	Circle circle = new Circle();
//		circle.pi=3.14;
//		circle.radius=5;
//		circle.area1();
		//�̰� private�� ���ܳ��� ���������Ҽ����� ���Ұ���
//		Circle cl1 = new Circle();
//		Circle cl2 = new Circle(5);
//		Circle cl3 = new Circle(5, 3.14);
//		
//		cl1.area1();
//		cl2.area1();
//		cl3.area1();
		
		// static = ���� ����� �����ϴ� Ű����
		// Ŭ������ �޸𸮻� ��ϵʰ� ���ÿ� ���� �޸𸮿� ��ϵ�
		// Ŭ������ ��ü�� �ν��Ͻ�ȭ ���� �ʾƵ� �ش� ��� ���� �� ��� �޼��带 ����� �� ����
		// �ش� Ŭ������ ��ü�� �ν��Ͻ�ȭ �� ��ü���� �ش� ��� ���� �� ��� �޼����� ���� ������
		// static�� ���� ����� �Ϲ� �޼��� �� ������ ����� �� ����
		// static�� �پ������� static�� �پ��ִ� ����� ����� ������
				
		//Triangle Ŭ������ ���� �ν��Ͻ�ȭ ���� �ʰ� �ش� static ��� ������ ��� �޼��带 ���
		Triangle.width = 10;
		Triangle.height = 20;
		Triangle.area();
		System.out.println("------------------");
		//Triangle Ŭ������ �ν��Ͻ�ȭ �ϰ� ��ü�� �����ϰ� �ش� ��� ������ ��� �޼��带 ���
		Triangle tri = new Triangle();
		tri.width2=10;
		tri.height2=5;
		tri.area2();
		tri.area();//���� ���� ���ü� ���� ������ �� ����
		//static�� ����Ͽ� width, height�� �޸𸮻� �����ǰ� �ֱ� ������ ����� ������
		tri.width=10;
		tri.height=10;
		
		Triangle tr2 = new Triangle();	
		tr2.area2();
		
		int rnd = (int)(Math.random()*10);//0~9������ �������ڸ� �߻����� rnd�� ����
	}
}
