package chap03;

public class MethodDemo4 {

	public static void main(String[] args) {
		
		//�޼��� �����ε�
		// �ϳ��� Ŭ������ ������ �̸��� �޼��尡 ������ �����ϴ� ��
		// �Ű������� ������ �޶�� �ϰ�, ��ȯ Ÿ��, ������ Ÿ���� �޶�� ��.
		
		int i1 = 3;
		int i2 = 7;
		int i3 = 10;
		double d1 = 7.0, d2 = 3.0;
		System.out.printf("max(%d,%d) = %d\n", i1, i2, max(i1, i2));
		System.out.printf("max(%.1f, %.1f)= %.1f\n", d1, d2, max(d1,d2));
		System.out.printf("max(%d, %d, %d) = %d\n", i1, i2, i3, max(i1, i2, i3));

		System.out.println("------------------------------------------------------------------");
		
		int x = 10;
		int y = 20;
		int z = 30;
		
		sum();
		sum(x);
		sum(x,y);
		sum(x,y,z);
		
	}
	
	public static int max(int n1, int n2) {
		int result = 0;
//		result = n1 > n2 ? n1 : n2;
		if(n1 > n2) {
			result = n1;
		}
		else {
			result = n2;
		}
		return result;
	}
	public static double max(double n1, double n2) {
		//max(int n1, int n2)�� �Ű����� ������ ���������� �Ű������� ������Ÿ���� �ٸ��Ƿ� �����ε��Ǽ� �ٸ��޼���� �νĵ�
		double result = 0;
//		result = n1 > n2 ? n1 : n2;
		if(n1 > n2) {
			result = n1;
		}
		return result;
	}
	public static int max(int n1, int n2, int n3) {
		//max(int n1, int n2)�� �Ű������� ���°� ���������� �Ű������� ������ �޶� �ٸ� �޼���� �νĵȴ�
		return max(max(n1,n2), n3);
	}
	public static void sum() {
		int a = 10;
		int b = 20;
		System.out.println("�Ű������� ���� �޼���(�Լ�) sum() " + (a + b));
	}
	public static void sum(int n1) {
		int b = 20;
		System.out.println("�Ű������� �ϳ��� �޼���(�Լ�) sum(x) " +(n1 + b));
	}
	public static void sum(int n1, int n2) {
		System.out.println("�Ű������� �ΰ��� �޼���(�Լ�) sum(x,y) " +(n1+n2));
	}
	public static void sum(int n1, int n2, int n3) {
		System.out.println("�Ű������� ������ �޼���(�Լ�) sum(x,y,z) " +(n1+n2+n3));
	}
}
