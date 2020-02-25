package javaReview2;

public class MicroWaveOven {
	// 전원 켜기끄기, 시작버튼 동작, 10초, 분
	boolean powerState ;
	int timer;
	
	public void powerOn() {
		if(powerState == true) {
			System.out.println("이미 전원이 켜져 있음");
		}
		else {
		System.out.println("전원 킴");
		}
	}
	public void powerOff() {
		if(powerState == false) {
			System.out.println("이미 전원 꺼져있음");
		}
		else {
		System.out.println("전원 끔");}
	}
	
	public MicroWaveOven() {//생성자를 이용하여 클래스 멤버 변수를 초기화 시켜줌
		timer = 30;
	}
	public MicroWaveOven(int a) {//사용자가 시간을 직접 입력하는 방식
		this.timer = a;
	}
	public MicroWaveOven(char count) {//로직에 의해서 계산된 값을 가져가는 방식
		int time = 0;
		for(int i = 0; i<(int)count; i++) {
			time = time+setTimer10sec2();
		}
		this.timer = time;
	}
	
	public void setTime10sec() {
		timer+=10;
	}
	public int setTimer10sec2() {
		return 10;
	}
	public void setTime1min() {
		timer+=60;
	}
	
	public void start() {
		if(timer > 0) {
			System.out.println(timer+"초 만큼 동작합니다");
		}
		else {
			System.out.println("시간이 설정되지 않았습니다");
		}
	}
}
