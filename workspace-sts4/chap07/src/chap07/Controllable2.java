package chap07;

public interface Controllable2 {

	//�������̽����� ����Ʈ�޼���, �����޼��尡 ����� �ü� ����
	
	//����Ʈ �޼��� ���
	default void repair() {
		System.out.println("��� �����Ѵ�");
	}
	
	//���� �޼��� ���
	static void reset() {
		System.out.println("��� �ʱ�ȭ�Ѵ�");
	}
	void turnOn();
	void turnOff();
}
