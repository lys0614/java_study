package chap07;

//�������̽� Controllable�� ��ӹ޾� ������ Ŭ���� Tv, Computer
//implements : �������̽��� ���
//extends : Ŭ������ ���
public class Tv implements Controllable{
	//�������̽��� ��ӹ޾� ������ �޼���
	@Override
	public void turnOn() {
		System.out.println("TV��");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV��");
	}
		
}


class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("COM��");
	}
	
	@Override
	public void turnOff() {
		System.out.println("COM��");
	}
}
