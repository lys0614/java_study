package javaReview2;

public class MicroWaveOven {
	// ���� �ѱ����, ���۹�ư ����, 10��, ��
	boolean powerState ;
	int timer;
	
	public void powerOn() {
		if(powerState == true) {
			System.out.println("�̹� ������ ���� ����");
		}
		else {
		System.out.println("���� Ŵ");
		}
	}
	public void powerOff() {
		if(powerState == false) {
			System.out.println("�̹� ���� ��������");
		}
		else {
		System.out.println("���� ��");}
	}
	
	public MicroWaveOven() {//�����ڸ� �̿��Ͽ� Ŭ���� ��� ������ �ʱ�ȭ ������
		timer = 30;
	}
	public MicroWaveOven(int a) {//����ڰ� �ð��� ���� �Է��ϴ� ���
		this.timer = a;
	}
	public MicroWaveOven(char count) {//������ ���ؼ� ���� ���� �������� ���
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
			System.out.println(timer+"�� ��ŭ �����մϴ�");
		}
		else {
			System.out.println("�ð��� �������� �ʾҽ��ϴ�");
		}
	}
}
