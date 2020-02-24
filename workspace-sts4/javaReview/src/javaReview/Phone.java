package javaReview;

public class Phone {
	//전화 받기,걸기,끊기, 전원 켜기끄기
	
	boolean power;
	boolean call;
	boolean end;
	
	public boolean powerOn() {
		this.power = true;
		System.out.println("전원 켬");
		return power;
	}
	public boolean powerOff() {
		this.power = false;
		System.out.println("전원 끔");
		return power;
	}

	public void takeCall() {
		if(power == false) {
			System.out.println("전원이 꺼져있음");
		}
		else if(power == true) {
			System.out.println("전화받아");
			call = true;
		}
	}
	
	public void endCall(int a) {	
		if(call == false) {
			System.out.println("전화 안하는 중임");
		}
		if(call == true) {
			if(a == 0) {
				end = false;
			}
			else if(a == 1) {
				end = true;
				System.out.println("전화 끊음");
				call=false;
			}
		}

	}
	
	public void sendCall() {
		if(power == false) {
			System.out.println("전원 부터 켜셈");
		}
		else if(power == true) {
			System.out.println("전화 거는 중");
			call = true;
		}
	}

	public void Calling(String a) {
		System.out.println(a+"에게 전화걺");
	}
	
	
	
}
