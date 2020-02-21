package chap04;

public class CircleDemo {

	static double radius; // CircleDemo 클래스의 멤버 변수 radius
	
	static double FindArea() {//CircleDemo 클래스의 멤버 메서드 FindArea()
		return 3.14 * radius * radius;
	}
	
	static void show(double x, double y) {//CircleDemo 클래스 내의 멤버 메서드 show(double x, double y)
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x,y);
	}
	
	static void test() {
		
	}
	
	public static void main(String[] args) {
		radius = 10.0;//같은 클래스 내에 있는 멤버 변수기 때문에 인스턴스화 안해줘도 됨
		
		double area = FindArea();//같은 클래스 내에 있는 메서드인 FindArea()의 결과값을 area라는 지역변수에 넣음
		
		show(radius, area);//같은 클래스 내에 있는 메서드인 show(double x, double y)를 실행함.
		test();
		TestClass ts = new TestClass();
		ts.test();

	}

}

	class TestClass {
		int xx = 10;
		int yy = 20;
		
		void test() {
			int xx = 1000;//지역변수를 클래스 멤버변수와 같은 값으로 선언
			int yy = 2000;
			//이러면 지역변수의 값이 우선적용된다. 우선권이 더 높기 때문
			//이때 클래스 멤버 변수를 호출하여 사용하려면 this 키워드를 사용해야함
			//this = 객체 자기 자신을 의미하는 키워드
			System.out.println("변수 xx 의 값 : "+xx+", 변수 yy의 값 : "+yy);
			System.out.println("클래스멤버 변수 xx의 값 : "+this.xx+", 클래스멤버 변수 yy의 값 : "+this.yy);
		}
	}