package chap03;

public class MethodDemo3 {

	public static void main(String[] args) {
		
		Mathman1();
		Mathman2(5,9);
		int[] result3 = new int[4];
		result3 = Mathman3();
		System.out.println("----------Mathman3--------");
		System.out.println("���� a+b �� : "+result3[0]);
		System.out.println("���� a-b �� : "+result3[1]);
		System.out.println("���� a*b �� : "+result3[2]);
		System.out.println("���� a/b �� : "+result3[3]);
		int[] result4 = new int[4];
		result4 = Mathman4(10,7);
		System.out.println("-----------Mathman4---------");
		System.out.println("���� a+b �� : "+result4[0]);
		System.out.println("���� a-b �� : "+result4[1]);
		System.out.println("���� a*b �� : "+result4[2]);
		System.out.println("���� a/b �� : "+result4[3]);
		
		System.exit(0);
	}
	
	public static void Mathman1() {
		System.out.println("--------------Mathman1----------");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(a+"+"+b+"="+c);
		c = a-b;
		System.out.println(a+"-"+b+"="+c);
		c = a*b;
		System.out.println(a+"*"+b+"="+c);
		c = a/b;
		System.out.println(a+"/"+b+"="+c);
		
	}
	
	public static void Mathman2(int a, int b) {//return �ϴ� ���� ������ void �ؾ� �Ѵ�.
		//2������ : �Ű����� o ��ȯ�� x
		System.out.println("--------------Mathman2----------");
		int plus = a + b;
		int minus = a - b;
		int multi = a * b;
		int divide = a / b;
		System.out.println("�� ���� ������ : "+a+"+"+b+"="+plus);
		System.out.println("�� ���� ������ : "+a+"-"+b+"="+minus);
		System.out.println("�� ���� ������ : "+a+"*"+b+"="+multi);
		System.out.println("�� ���� �������� : "+a+"/"+b+"="+divide);
	}
	
	public static int[] Mathman3() {//��ȯ���� ������ ����° �ڵ忡 ��ȯ���� ������ ���ϴ� �ܾ �־�� ��.
		//3������ �Ű����� x ��ȯ�� o

		int a = 20;
		int b = 5;
		int[] c = new int[4];//4�� �����Ҽ��ִ� �迭 ����
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
		
		return c;
	}
	
	public static int[] Mathman4(int a, int b) {
		//4������ �Ű����� o, ��ȯ�� o
		
		int[] c = new int[4];
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
		return c;
	}
}
