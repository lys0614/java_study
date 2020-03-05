package chap06;

public class OverTypeDemo {

	public static void main(String[] args) {

//		
//		Vehicle v = new Car();
//		System.out.println(v.name);//�θ�Ŭ���� Ÿ���� ��� ���� ����
//		v.whoamI();//�������̵� �� whoamI()�� �����
//		v.move();
		
		Vehicle v = new Vehicle();
		System.out.println(v.name);
		v.whoamI();
		v.move();
		
		System.out.println("------------");
		
		Car c = new Car();
		System.out.println(c.name);
		c.whoamI();
		c.move();
		
		System.out.println("------------");
		
		v=c;
		System.out.println(v.name);
		v.whoamI();
		v.move();
	}

}

class Vehicle{
	String name = "Ż ��";
	
	void whoamI() {//��ӵǾ� �������̵� �� �޼���
		System.out.println("���� Ż ���̴�.");
	}
	
	static void move() {//static�̶� ��ӵ�������, Ŭ������ ����μ� �����Ǿ� ����. �������̵� �Ұ�
		System.out.println("�̵��ϴ�");
	}
}

class Car extends Vehicle{
	String name = "�ڵ���";
	
	void whoamI() {//�θ�Ŭ������ whoamI()�� �������̵���
		System.out.println("���� �ڵ����̴�");
	}
	
	static void move() {
		System.out.println("�޸���");
	}
}
