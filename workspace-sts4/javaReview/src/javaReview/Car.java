package javaReview;

public class Car {
	//색상, 탑승인원, 크기(대형, 중형, 준중형, 소형, 경차), 타입(suv, 세단), 연료(lpg,전기,가솔린,디젤)
	//속도, 현재상태(이동, 멈춤, 주차)
	
	//멤버메서드 : 시동 켬/끔, 이동, 멈춤, 주차
	
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
			if(status == "멈춤") {
				System.out.println("멈춰 있음");
			}
			else if(status == "이동") {
				if(speed == "빠름") {
					System.out.println("빠르게 이동 중");
				}
				else if(speed == "보통") {
					System.out.println("보통속도로 이동 중");
				}
				else if(speed == "느림") {
					System.out.println("느리게 이동 중");
				}
			}
			else if(status == "주차") {
				System.out.println("주차 중");
			}
		}
		else if(power == false) {
			System.out.println("시동이 꺼져 있음");
		}
	}
	
	public void color() {
		System.out.println("색상 : "+color);
	}
	
	public void type() {
		System.out.println("타입 : "+type);
	}
	
	public void size() {
		System.out.println("크기 : "+size);
	}
	public void fuel() {
		System.out.println("연료 : "+fuel);
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