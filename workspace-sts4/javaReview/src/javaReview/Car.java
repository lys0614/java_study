package javaReview;

public class Car {
	//����, ž���ο�, ũ��(����, ����, ������, ����, ����), Ÿ��(suv, ����), ����(lpg,����,���ָ�,����)
	//�ӵ�, �������(�̵�, ����, ����)
	
	//����޼��� : �õ� ��/��, �̵�, ����, ����
	
	boolean power;
	String color;
	int man;
	String size;
	String type;
	String fuel;
	String speed;
	String status;
	
	public boolean powerOn() {
		this.power = true;
		return power;
	}
	public boolean powerOff() {
		this.power = false;
		return power;
	}
	
	public void status() {
		if(power == true) {
			if(status == "����") {
				System.out.println("���� ����");
			}
			else if(status == "�̵�") {
				if(speed == "����") {
					System.out.println("������ �̵� ��");
				}
				else if(speed == "����") {
					System.out.println("����ӵ��� �̵� ��");
				}
				else if(speed == "����") {
					System.out.println("������ �̵� ��");
				}
			}
			else if(status == "����") {
				System.out.println("���� ��");
			}
		}
		else if(power == false) {
			System.out.println("�õ��� ���� ����");
		}
	}
	
	public void color() {
		System.out.println("���� : "+color);
	}
	
	public void type() {
		System.out.println("Ÿ�� : "+type);
	}
	
	public void size() {
		System.out.println("ũ�� : "+size);
	}
	public void fuel() {
		System.out.println("���� : "+fuel);
	}
	
	public String colorCheck(String a) {
		this.color = a;
		return color;
	}
	public String typeCheck(String a) {
		this.type = a;
		return type;
	}
	public String fuelCheck(String a) {
		this.fuel = a;
		return fuel;
	}
	public String sizeCheck(String a) {
		this.size = a;
		return size;
	}
	public String moveCheck(String a) {
		this.status = a;
		return status;
	}
	public String speedCheck(String a) {
		this.speed = a;
		return speed;
	}
	
	
}