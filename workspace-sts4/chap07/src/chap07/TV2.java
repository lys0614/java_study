package chap07;

//interface ���� ���

public class TV2 implements Control1, Control2{

	@Override
	public void powerOn() {
		System.out.println("�׷��� ���� ��");
	}
	
	@Override//�������̵� ���� üũ�ϴ� ������̼� ����
	public void powerOff() {
		System.out.println("�׷��� ���� ��");
	}
	
	@Override
	public void VolumeUp() {
		System.out.println("TV �Ҹ��ø�");
	}
	
	@Override
	public void VolumeDown() {
		System.out.println("TV �Ҹ� ����");
	}
}


class Computer2 implements Control1{
	@Override
	public void powerOff() {
		System.out.println("�� ��");
	}
	
	@Override
	public void powerOn() {
		System.out.println("�� ��");
	}
}