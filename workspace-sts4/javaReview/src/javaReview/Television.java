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
	//Ŭ������ ȥ�ڼ� ������ �ȵ�.
	//powerOn() �� ������ �ȵǴ� ������ �װ���
	//������ �ݵ�� �޼��� ������ �����ؾ���
	//Ŭ������ ȥ�� ���� �ȵǼ� �ν��Ͻ�ȭ �ؼ� �����
	
	//Television Ŭ������ ������
	//�����ڴ� �⺻������ Ŭ������ ��� ������ �ʱ�ȭ �ϴµ� �����.
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
		System.out.println(name + "������ ����");
	}
	public void powerOff() {
		power = false;
		System.out.println(name + "���� ��");
	}
	
	public void channelUp() {
		channel++;
		if(channel > maxChannel) {
			channel = minChannel;
		}
		System.out.println(name + "���� ä���� : "+channel+"��");
	}
	public void channelDonw() {
		channel--;
		if(channel < minChannel) {
			channel = maxChannel;
		}
		System.out.println(name + "���� ü���� : "+channel+"��");
	}
	
	public void volumeUp() {
		volume++;
		if(volume >maxVolume) {
			volume = maxVolume;
		}
		System.out.println(name + "���� ���� :"+volume);
	}
	public void volumeDown() {
		volume--;
		if(volume < minVolume) {
			volume = minVolume;
		}
		System.out.println(name + "���纼�� :"+volume);
	}
}
