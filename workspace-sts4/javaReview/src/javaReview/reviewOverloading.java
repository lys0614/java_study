package javaReview;

public class reviewOverloading {
	
	public static void main(String[] args) {
		//�޼��� �����ε� : �ڹٿ��� ������ �̸��� �޼��带 ������ ����ϴ°�
		//			������ ����� ������ ������ ������ Ÿ�Ե��� �޶� ����ϴ� ���.
		//			����� ���� ����� ���� �ִ� �ڹ� ���
				//�����ε� ���� 1 : �Ű������� Ÿ���� �ٸ�.
				//		���� 2 : �Ű������� ������ �ٸ�
		sum();
		sum(8,7);
		sum(11.7, 6.77);
		sum(57.77);
		System.out.println("-----------------------");
		sub();
		sub(8, 1);
		sub(32.5, 12.9);
		System.out.println("-----------------------");
		multi();
		multi(88, 2);
		multi(1.6, 3.4);
		System.out.println("-----------------------");
		div();
		div(6, 2);
		div(3.5, 0.5);
		System.out.println("-----------------------");
		System.out.println("�ܺο��� Ŭ���� ����� Ŭ�������� �ҷ��ͼ� �ٽ� �ҷ����°�");
		abcd yo = new abcd();
		yo.ang();
	}
	
	public static void sum() {
		int a=20;
		int b=10;
		System.out.println("�Ű����� ���� �� �� �� �� : "+a+"+"+b+"="+(a+b));
	}
	//2������, �Ű�����o ��ȯ��x
	//�����ε� �� sum(�Ű�����1,�Ű�����2)�Լ�
	public static void sum(int a, int b) {
		System.out.println("������ �Ű����� �� ���� �� : "+a+"+"+b+"="+(a+b));
	}
	//�Ű������� ������ �޴� sum�޼���� �޴� �Ű������� Ÿ���� �ٸ�.
	public static void sum(double a, double b) {
		System.out.println("�Ǽ��� �Ű����� �� ���� �� : "+a+"+"+b+"="+(a+b));
	}
	//�Ű������� �ΰ��޴� sum�޼���� �޴� �Ű������� ������ �ٸ�.
	public static void sum(double a) {
		double b = 7.8;
		System.out.println("�Ǽ��� �Ű����� 1���� �ް� �� ���� �� : "+a+"+"+b+"="+(a+b));
	}

	public static void sub() {
		int a = 20;
		int b = 5;
		System.out.println("�Ű��������� �� ���� �� : "+a+"-"+b+"="+(a-b));
	}
	public static void sub(int a, int b) {
		System.out.println("�� ������ �Ű������� �� : "+a+"-"+b+"="+(a-b));
	}
	public static void sub(double a, double b) {
		System.out.println("�� �Ǽ��� �Ű������� ��  : "+a+"-"+b+"="+(a-b));
	}
	
	public static void multi() {
		int a = 20;
		int b = 5;
		System.out.println("�Ű����� ���� �� ���� �� : "+a+"*"+b+"="+(a*b));
	}
	public static void multi(int a, int b) {
		System.out.println("�� ������ �Ű������� �� : "+a+"*"+b+"="+(a*b));
	}
	public static void multi(double a, double b ) {
		System.out.println("�� �Ǽ��� �Ű������� �� : "+a+"*"+b+"="+(a*b));
	}
	
	public static void div() {
		int a= 20;
		int b = 5;
		System.out.println("�Ű����� ���� �� ���� ������ : "+a+"/"+b+"="+(a/b));
	}
	public static void div(int a, int b ) {
		System.out.println("�� ������ �Ű������� ������ : "+a+"/"+b+"="+(a/b));
	}
	public static void div(double a, double b) {
		System.out.println("�� �Ǽ��� �Ű������� ������ : "+a+"/"+b+"="+(a/b));
	}
}

class abcd{
	reviewOverloading rv = new reviewOverloading();
	
	public void ang() {
		rv.sum();
	}
}

