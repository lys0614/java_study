package chap04;

public class Calculator2 {

	public static void main(String[] args) {
		Cal2 cal2 = new Cal2(5,9);//�޼���(�Լ�)�����ϴ� ���·� �����ڸ� ȣ����. �޼��� ȣ���ؼ� �����Ҷ��� ���� ������.
//		cal2.a = 10;
//		cal2.b = 5;
		cal2.sum();
		
		//������ �����ε� �ϱ�
		//�����ε� = ���� �̸��� �޼��忡 �ٸ� �Ű����� ����, �ٸ� ������ Ÿ���� ���ϰ� �ִ� �͵��� �ٸ� �޼���� ����Ѵ�
		Cal3 cal3 = new Cal3(111, 27);//�޼���(�Լ�)�����ϴ� ���·� �����ڸ� ȣ����. �޼��� ȣ���ؼ� �����Ҷ��� ���� ������.
		cal3.sum();
		cal3.sub();
		cal3.mul();
		cal3.div();
		
		Cal3 cal31 = new Cal3();
		cal31.sum();
		cal31.sub();
		cal31.mul();
		cal31.div();
		
		Cal3 cal32 = new Cal3(5);
		cal32.mul();
	}
	
}

class Cal2{//Calculator2 �� �ܺ� Ŭ���� Cal2
	int a; // ����ڰ� ���� �ʱ�ȭ���� �ʾƼ� �⺻���� 0�� ��
	int b;
	
	public Cal2(int x, int y) {//������ �޼���, �����ڶ� new Ű���� �ڿ� ������ �̸��� ������ �ڵ����� ��������ڰ� �������
		a=x; b=y;
	}
	
	public void sum() {//Cal2�� ��� �޼���
		int c= a+b;
		System.out.println(a+"+"+b+" = "+c);
	}
}

class Cal3{//Calculator2 �ܺ�Ŭ���� Cal3
	private int a, b;//����ڰ� ���� �ʱ�ȭ ���� �ʾƼ� �⺻���� 0�� �� private�̱� ������ Calculator2���� ������ ȣ���� ���� �ҷ������� �� ���� Calculator2���� ����Ұ�
	
	//������
	//�����ڴ� �̸��� Ŭ������ �����ؾ���
	//�����ڴ� ��ȯŸ���� ����
	//����ڰ� �����ڸ� ������ �ʾ��� ��� �ڵ����� �����Ϸ��� ���� �����ڸ� ����
	//�����ڰ� ������ �� �����ڸ� ������� ��� �����Ϸ��� ���� �����ڸ� ������ ����.
	//����ڰ� �����ڸ� �ϳ��� ������� ��� �����Ϸ��� ��������ڸ� ������ ����
	//�����ڵ� �����ε� ������
	public Cal3() {// ������ �޼���
		a=10;
		b=5;
	}
	
	public Cal3(int x) {//�Ű������� ���� 1�� �޾Ƽ� ��������� �ʱ�ȭ
		a= x;
		b= a-(a/2);
	}
	
	public Cal3(int x, int y) {
		a=x;
		b=y;
	}
	
	public void sum() {
		int c = a+b;
		System.out.println(a+"+"+b+" = "+c);
	}
	
	public void sub() { // Cal3�� ��� �޼���.
		int c = a-b;
		System.out.println(a+"-"+b+" = "+c);
	}
	
	public void mul() {
		int c = a*b;
		System.out.println(a+"*"+b+" = "+c);
	}
	
	public void div() {
		int c = a/b;
		System.out.println(a+"/"+b+" = "+c);
	}
	
}