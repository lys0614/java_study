package chap07;

public class ControlDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV4 tv = new TV4();
		Computer4 com = new Computer4();
		
		tv.turnOff();
		tv.turnOn();
		tv.repair();//repair()�� Controllable2 �� ����Ʈ �޼���, �׸� ��ӹ޾� ����Ѱ� / �������̵��� ������ / �������̽����� �޼��� ����� ������(default �޼���� ����) / static �޼��尡 �ƴϱ� ������ �������̽���.�޼���� ���� ������ �Ұ����� �ݵ�� ��ӹ޾ƾ߸� ��밡�� 
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable2.reset();//static �޼���� ������ �������̽���.�޼���� ���� ������ ����
		//�� ��Ȳ���� �������� �ڵ�� 
//		tv.reset();//reset()�� �������̽��� ���� �޼����̱� ������ �������̽���.�޼���� ���� ���� ȣ���ؾ��Ѵ�
//		com.reset();
//		Controllable2.repair();//repair()�� �������̽��� ����Ʈ�޼���� ������ ����� ���ؼ��� ������ ������
		//�������̽��� ����� ���������ڷ� private�� ����� �� ����
	}

}
