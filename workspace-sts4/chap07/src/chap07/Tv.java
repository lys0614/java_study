package chap07;

//인터페이스 Controllable을 상속받아 구현한 클래스 Tv, Computer
//implements : 인터페이스를 상속
//extends : 클래스를 상속
public class Tv implements Controllable{
	//인터페이스를 상속받아 구현한 메서드
	@Override
	public void turnOn() {
		System.out.println("TV켬");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV끔");
	}
		
}


class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("COM켬");
	}
	
	@Override
	public void turnOff() {
		System.out.println("COM끔");
	}
}
