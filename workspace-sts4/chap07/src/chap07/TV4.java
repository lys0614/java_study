package chap07;

public class TV4 implements RemoteControllable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �Ҵ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ����");
	}

	@Override
	public void RemoteOn() {}

	@Override
	public void RemoteOff() {}


}

class Computer4 implements RemoteControllable{
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("PC�� �Ҵ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("PC�� ����");
	}
	
	@Override
	public void RemoteOn() {}

	@Override
	public void RemoteOff() {}
}