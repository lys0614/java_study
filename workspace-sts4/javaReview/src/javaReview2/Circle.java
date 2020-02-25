package javaReview2;

public class Circle {

	private double PI;
	private int radius;
	
	//�⺻���� �������� ������
	public Circle() {
//		this.radius = 5;
//		this.PI=3.14; -> ��������� ���� ��Ĵ�� ��� ������ ���� �����Է�
		this(5, 3.14);
		//this()�� �̿��Ͽ� �ҽ��� ����ȭ�Ѱ�
		//this()�� �̿��Ͽ� �Ű����� 2���޴� �޼���� �Ѱ���
	}
	//����ڰ� �Է��� ���� ����ϸ鼭 ���α׷� �⺻���� ���
	//this()�� ����Ͽ� ����ڰ� �Է��� �κа� ���α׷� �⺻���� �ٸ� �����ڿ��� ����
	public Circle(int radius) {
//		this.radius = radius;
//		this.PI=3.14;
		this(radius, 3.14);//this()�� �̿��Ͽ� �Ű����� 2���޴� �޼���� �Ѱ���
		
	}
	//��� �����͸� ����ڰ� �Է��� ���� ����ϴ� ���.
	public Circle(int radius, double PI) {
		//this()�� �̿��Ͽ� �ҽ��� ����ȭ�� ��� ���� Ȯ���� ������, ���������� ����
		this.radius = radius;
		this.PI= PI;
		
	}
	
	//�⺻ ��� : ��ü�� �̿��Ͽ� Ŭ���� ��� ������ ���� �����Ͽ� �����͸� �Է� �� ���
	//��� Ŭ���� ������ private�� ����Ͽ� ĸ��ȭ ������� ���� ������ �Ұ�����.
	// getter, setter �� �̿��ؿ� ��ȸ������ �ϰų� �����ڸ� �̿��Ͽ� ���� ����
	public void area1() {
		System.out.printf("���� ���̴� : %.2f\n", PI*radius);
	}
	
	
	
}
