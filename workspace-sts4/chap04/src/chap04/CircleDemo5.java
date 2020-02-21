package chap04;

public class CircleDemo5 {
	public CircleDemo5(){
		//����ڰ� ���� �⺻ ������
		this(10.0, "����");//this()�� ���� ������ �ȿ��� �Ǵٸ� �����ڸ� ȣ����
		//�Ű������� 10.0�� "����" �� CircleDemo5 �����ڸ� �����Ѱ�.
		new CircleDemo5(10.0, "����");
	}
	
	public CircleDemo5(String color) {
		this(10.0, color);
		//�Ű����� color�� �޾Ƽ� CircleDemo5(10.0, color) �����ڸ� �����Ѱ�
	}
	public CircleDemo5(double radius) {
		this(radius, "����");
		//�Ű����� radius�� �޾Ƽ� CircleDemo5(radius, "����")�����ڸ� �����Ѱ�
	}
	public CircleDemo5(double radius, String color) {//source -> generate Constructors using fields �Ἥ ����.
		//�ʵ忡 �ִ� ��������� ����ϴ� �����ڸ� ������ִ� �ɼ���.
		this.radius = radius;
		this.color = color;
	}
	
	public void show() {
		System.out.printf("������ : %.1f , ���� : %s\n", radius, color);
	}
	double radius;
	String color;

}
