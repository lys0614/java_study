package chap07;

//interface 다중 상속

public class TV2 implements Control1, Control2{

	@Override
	public void powerOn() {
		System.out.println("테레비 전원 켬");
	}
	
	@Override//오버라이딩 여부 체크하는 어노테이션 문구
	public void powerOff() {
		System.out.println("테레비 전원 끔");
	}
	
	@Override
	public void VolumeUp() {
		System.out.println("TV 소리올림");
	}
	
	@Override
	public void VolumeDown() {
		System.out.println("TV 소리 내림");
	}
}


class Computer2 implements Control1{
	@Override
	public void powerOff() {
		System.out.println("컴 끔");
	}
	
	@Override
	public void powerOn() {
		System.out.println("컴 켬");
	}
}