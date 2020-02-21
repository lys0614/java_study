package chap04;

public class Calculator {

	public static void main(String[] args) {
		Cal cal = new Cal(); // Cal 클래스를 cal 이란 이름으로 메모리에 등록시켜 인스턴스화. 객체화 시킨것.
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