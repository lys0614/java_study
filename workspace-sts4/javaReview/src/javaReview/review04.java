package javaReview;

public class review04 {

	public static void main(String[] args) {
		
	//Ŭ���� : ������ ���α׷� ���赵, ��� ������ ��� �޼��带 ������ �ִ� ���� Ÿ��. Ư�� ����� �����ϱ� ���ؼ� �ʿ��� ������
	// Ư�� ����� �����ϴ� �ޤõ���� �ϳ��� �̸����� ��� ��Ƶ� ��
		
		Cal cal = new Cal();
		int sum = cal.sum(20, 5); // Cal Ŭ������ sum �Լ��� ����, ��ȯ���� ���� sum�� ����.
		
		//Television Ŭ������ �ν��Ͻ�ȭ �Ͽ� ��ü�� ����
		Television tv = new Television("701");
		//Televesion Ŭ������ ��ü�� ������� ������ Television Ŭ������ ��� ������ ��� �޼��带 ����Ҽ� ����.
		//Ŭ���� ���� ������ ������ Ÿ���̱� ������ ������ �����ؼ� ����� �� �ִ�. �� ������ �˰� ���°� ����.
		tv.powerOn();
		tv.channelUp();
		tv.volumeUp();
		System.out.println("--------------------------");
		Television tv1 = new Television("702");
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.volumeUp();
		tv1.volumeUp();
		
	}
	
}

class Cal{
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
}