package chap07;

public class Notebook extends Computer4 implements Portable {

	@Override
	public void inMyBag() {
		System.out.println("��Ʈ���� ���濡 �ִ�");
	}

	public void turnOn() {
		System.out.println("��Ʈ�� ��");
	}
	
	public void turnOff() {
		System.out.println("��Ʈ�� ��");
	}
	public static void main(String[] args) {

		Notebook n = new Notebook();
		
		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}

}
