package chap04;

public class Calculator {

	public static void main(String[] args) {
		Cal cal = new Cal(); // Cal Ŭ������ cal �̶� �̸����� �޸𸮿� ��Ͻ��� �ν��Ͻ�ȭ. ��üȭ ��Ų��.
		cal.a = 10;
		cal.b = 20;
		cal.sum();
		cal.sub();
		cal.mult();
		cal.div();

	}

}

class Cal{
	int a;
	int b;
	
	void sum() {
		int c= a+b;
		System.out.println(a+" + "+b+" = "+c);
	}
	void sub() {
		int c = a-b;
		System.out.println(a+" - "+b+" = "+c);
	}
	void mult() {
		int c = a*b;
		System.out.println(a+" * "+b+" = "+c);
	}
	void div() {
		int c = a/b;
		System.out.println(a+" / "+b+" = "+c);
	}

}