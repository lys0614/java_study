package chap06;

public class Circle {

	private void secret() {
		//private�� Ŭ���� �������� ������ ����Ѵ�.
		//�׷��� ����� �ȵȴ�
		System.out.println("���");
	}
	
	protected void findRadius() {
		//���������� protected �� �θ�-�ڽ� ���̿����� ������ ����Ѵ�.
		//��� ����
		System.out.println("������ 10.0��Ƽ");
	}
	
	public void findArea() {
		//��� Ŭ�������� ���� ����
		//��� ����
		System.out.println("���̴� (����*������*������)�̴�");
	}
	
}
