package javaReview;

public class Television {

	String name;
	boolean power;
	int channel;
	int volume;
	private int minVolume=0;
	private int maxVolume=99;
	private int minChannel = 1;
	private int maxChannel = 99;
	//클래스는 혼자서 동작이 안됨.
	//powerOn() 이 동작이 안되는 이유가 그거임
	//실행은 반드시 메서드 내에서 실행해야함
	//클래스는 혼자 실행 안되서 인스턴스화 해서 써야함
	
	//Television 클래스의 생성자
	//생성자는 기본적으로 클래스의 멤버 변수를 초기화 하는데 사용함.
	public Television(String name) {
		this.name = name;
		power = false;
		channel = 0;
		volume = 0;
	}
	
	public void powerOn() {
		power = true;
		if(power == true) {
			
		}
		System.out.println(name + "전원이 켜짐");
	}
	public void powerOff() {
		power = false;
		System.out.println(name + "전원 끔");
	}
	
	public void channelUp() {
		channel++;
		if(channel > maxChannel) {
			channel = minChannel;
		}
		System.out.println(name + "현재 채널은 : "+channel+"번");
	}
	public void channelDonw() {
		channel--;
		if(channel < minChannel) {
			channel = maxChannel;
		}
		System.out.println(name + "현재 체널은 : "+channel+"번");
	}
	
	public void volumeUp() {
		volume++;
		if(volume >maxVolume) {
			volume = maxVolume;
		}
		System.out.println(name + "현재 볼륨 :"+volume);
	}
	public void volumeDown() {
		volume--;
		if(volume < minVolume) {
			volume = minVolume;
		}
		System.out.println(name + "현재볼륨 :"+volume);
	}
}
