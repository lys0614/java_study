package javaReview;

public class Phone {
	//��ȭ �ޱ�,�ɱ�,����, ���� �ѱ����
	
	boolean power;
	boolean call;
	boolean end;
	
	public boolean powerOn() {
		this.power = true;
		System.out.println("���� ��");
		return power;
	}
	public boolean powerOff() {
		this.power = false;
		System.out.println("���� ��");
		return power;
	}

	public void takeCall() {
		if(power == false) {
			System.out.println("������ ��������");
		}
		else if(power == true) {
			System.out.println("��ȭ�޾�");
			call = true;
		}
	}
	
	public void endCall(int a) {	
		if(call == false) {
			System.out.println("��ȭ ���ϴ� ����");
		}
		if(call == true) {
			if(a == 0) {
				end = false;
			}
			else if(a == 1) {
				end = true;
				System.out.println("��ȭ ����");
				call=false;
			}
		}

	}
	
	public void sendCall() {
		if(power == false) {
			System.out.println("���� ���� �Ѽ�");
		}
		else if(power == true) {
			System.out.println("��ȭ �Ŵ� ��");
			call = true;
		}
	}

	public void Calling(String a) {
		System.out.println(a+"���� ��ȭ��");
	}
	
	
	
}
