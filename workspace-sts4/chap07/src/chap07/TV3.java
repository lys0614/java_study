package chap07;
//TV3클래스는 인터페이스 Conterol3을 상속받아 구현함
//Control3이 가지고 있는 추상 메서드 ChannelUp, ChannelDown만 오버라이딩을 통해 구현하면 오류가 발생
//Control3이 상속받은 Control1과 Control2의 추상메서드도 구현을 해줘야 오류가 발생하지 않음.
public class TV3 implements Control3{

	//Control3의 추상메서드들
	@Override
	public void ChannelUp() {
		System.out.println("채널 1 올림");
	}
	
	@Override
	public void ChannelDown() {
		System.out.println("채널 1 내림");
	}
	//Control3에서 상속받은 Cotnrol1의 추상메서드들
	@Override 
	public void powerOn(){
		System.out.println("TV전원 켬");
	}
	@Override
	public void powerOff() {
		System.out.println("TV전원 끔");
	}
	//Control3 에서 상속받은 Control2의 추상메서드들
	@Override
	public void VolumeUp() {
		System.out.println("TV볼륨 올림");
	}
	@Override
	public void VolumeDown() {
		System.out.println("TV볼륨 내림");
	}
}
