package chap07;

public class TV4 implements RemoteControllable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ÄÒ´Ù");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ²ö´Ù");
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
		System.out.println("PC¸¦ ÄÒ´Ù");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("PC¸¦ ²ö´Ù");
	}
	
	@Override
	public void RemoteOn() {}

	@Override
	public void RemoteOff() {}
}