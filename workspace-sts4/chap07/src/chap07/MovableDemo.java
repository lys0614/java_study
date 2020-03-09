package chap07;

interface Movable{
	void move(int x);
}

class Car implements Movable{
	private int pos = 0;
	public void move(int x) {
		pos+=x;
	}
	public void show() {
		System.out.println(pos+"��ŭ �̵���");
	}
}


public class MovableDemo {

	public static void main(String[] args) {
		
		Movable m = new Car();
		
		m.move(5);
		//m.show(); Movable Ÿ������ ȣ���� Car ��ü m��  show()�� ȣ���� ������
		//show()�޼���� CarŬ���� ������ �޼���� ������ ����� �� ����.
		
		//������ �ڽ� Ŭ���� Ÿ���̾����� �ٽ� �ڽ�ũ���� Ÿ������ ��ȯ�� ������
		//�� ��, ���� Ÿ�� ��ȯ�� �����ؾ� �Ѵ�
		Car c = (Car)m;
		c.move(10);
		c.show();

	}

}
