package chap07;

public class CircleDemo {

	public static void main(String[] args) {

		Circle2 c1 = new Circle2(5.0);
		Circle2 c2 = new Circle2(6.0);
		
		if(c1.compareTo(c2) > 0) {
			System.out.println("ù ��° ���� �� ��° ������ ũ��");
		}
		else if(c1.compareTo(c2) == 0) {
			System.out.println("�� ���� ũ�Ⱑ ����");
		}
		else System.out.println("ù ��° ���� �� ��° ������ �۴�");
	}

}
//�ڹٿ��� �⺻���� �����ϴ� �������̽��� Comparable�� ��ӹ޾� ����� ��ü�� ��
//�������̽� Comparable �� �߻�޼��� compareTo�� ��ӹ޾� �������̵��Ͽ� ����Ѵ� 
class Circle2 implements Comparable{
	double radius;
	
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	
	//Object�� �ڹٿ��� ���� ū Ÿ������ �ڹ��� ��� Ŭ������ Object Ŭ������ ������
	//Circle2�� ��ü c2�� �Ű������� �޾� Object o �� ����
	//Object o �� �����Ͱ� ����Ǹ� �ڵ� Ÿ�Ժ�ȯ�� �߻���
	@Override
	public int compareTo(Object o) {
		Circle2 c = (Circle2)o;
		
		if(this.radius>c.radius) {
			return 1;
		}
		else if(this.radius == radius) {
			return 0;
		}
		else return -1;
	}
}

