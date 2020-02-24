package javaReview;

public class reviewOverloading {
	
	public static void main(String[] args) {
		//메서드 오버로딩 : 자바에서 동일한 이름의 메서드를 여러개 사용하는것
		//			동일한 기능을 가지고 있으나 데이터 타입등이 달라서 사용하는 방법.
		//			사용자 편의 기능을 위해 있는 자바 기능
				//오버로딩 기준 1 : 매개변수의 타입이 다름.
				//		기준 2 : 매개변수의 개수가 다름
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
		System.out.println("외부에서 클래스 만들고 클래스에서 불러와서 다시 불러오는거");
		abcd yo = new abcd();
		yo.ang();
	}
	
	public static void sum() {
		int a=20;
		int b=10;
		System.out.println("매개변수 없는 두 수 의 합 : "+a+"+"+b+"="+(a+b));
	}
	//2번형태, 매개변수o 반환값x
	//오버로딩 될 sum(매개변수1,매개변수2)함수
	public static void sum(int a, int b) {
		System.out.println("정수형 매개변수 두 수의 합 : "+a+"+"+b+"="+(a+b));
	}
	//매개변수를 정수로 받는 sum메서드와 받는 매개변수의 타입이 다름.
	public static void sum(double a, double b) {
		System.out.println("실수형 매개변수 두 수의 합 : "+a+"+"+b+"="+(a+b));
	}
	//매개변수를 두개받는 sum메서드와 받는 매개변수의 개수가 다름.
	public static void sum(double a) {
		double b = 7.8;
		System.out.println("실수형 매개변수 1개만 받고 두 수의 합 : "+a+"+"+b+"="+(a+b));
	}

	public static void sub() {
		int a = 20;
		int b = 5;
		System.out.println("매개변수없이 두 수의 차 : "+a+"-"+b+"="+(a-b));
	}
	public static void sub(int a, int b) {
		System.out.println("두 정수형 매개변수의 차 : "+a+"-"+b+"="+(a-b));
	}
	public static void sub(double a, double b) {
		System.out.println("두 실수형 매개변수의 차  : "+a+"-"+b+"="+(a-b));
	}
	
	public static void multi() {
		int a = 20;
		int b = 5;
		System.out.println("매개변수 없이 두 수의 곱 : "+a+"*"+b+"="+(a*b));
	}
	public static void multi(int a, int b) {
		System.out.println("두 정수형 매개변수의 곱 : "+a+"*"+b+"="+(a*b));
	}
	public static void multi(double a, double b ) {
		System.out.println("두 실수형 매개변수의 곱 : "+a+"*"+b+"="+(a*b));
	}
	
	public static void div() {
		int a= 20;
		int b = 5;
		System.out.println("매개변수 없이 두 수의 나누기 : "+a+"/"+b+"="+(a/b));
	}
	public static void div(int a, int b ) {
		System.out.println("두 정수형 매개변수의 나누기 : "+a+"/"+b+"="+(a/b));
	}
	public static void div(double a, double b) {
		System.out.println("두 실수형 매개변수의 나누기 : "+a+"/"+b+"="+(a/b));
	}
}

class abcd{
	reviewOverloading rv = new reviewOverloading();
	
	public void ang() {
		rv.sum();
	}
}

