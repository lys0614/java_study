package chap06;

public class Ball extends Circle{

	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "���̴�");
	}
	
	public void findVolume() {
		System.out.println("���Ǵ� 4/3(����*������*������*������) �̴�");
	}
	
	//�������̵� = �θ�Ŭ�����κ��� ������� �޼����� ������ �����Ͽ� ����ϴ°�
	//�θ�Ŭ������ �޼��� ������ 100% �����ϰ� �Է��ؾ� �ϸ�, �����ڵ�� �ڽ�Ŭ������ �°� �����ؼ� ����Ѵ�
	@Override // <- Annotation = Ư�� ȿ���� �ִٰ� �˷��ִ� ���
	//�������̵� ��Ģ�� Ʋ�� ��� �����޽����� �����
	public void findArea() {
		//�θ�Ŭ������ �ִ� ���� �״�� �����ͼ� �����
		findRadius();
		super.findArea();
		System.out.println("���̴� 4*(����*������*������)�̴�");
	}
	
	
}
