package chap04;

public class CarDemo {

	public static void main(String[] args) {
		Car car = new Car();// car ��� �̸����� Car Ŭ������ �ν��Ͻ�ȭ
		car.name="������";//car Ŭ������ �ִ� ��������� name�� �ҷ��ͼ� �����ζ�� �����͸� �Է�
		car.color="ȸ��";//car Ŭ������ �ִ� ��������� color�� �ҷ��ͼ� ȸ���̶�� �����͸� �Է�
		car.type="����";//car Ŭ������ �ִ� ��������� type�� �ҷ��ͼ� �����̶�� �����͸� �Է�
		car.price="3000";//car Ŭ������ �ִ� ��������� price�� �ҷ��ͼ� 3000�̶�� �����͸� �Է�
		car.Output();//car Ŭ������ �ִ� ����޼����� Output()�� �ҷ��ͼ� �� �ȿ� �ִ� ���۵��� �����Ѵٰ� ����
		
		
	}
}


class Car{//Ŭ���� ����
	//Ŭ���� ��������� ����
	String price;
	String color;
	String type;
	String name;
	
	void Output() {//Ŭ���� ����޼���(����Լ�) ����
		//�޼��带 �ҷ������� ������ ���� ����
		System.out.println("�̸� : "+name+", ���� : "+price+", ���� : "+color+", ���� : "+type);
	}
}