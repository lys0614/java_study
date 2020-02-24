package javaReview;

public class review01_03 {

	public static void main(String[] args) {
		//메서드 : 자바스크립트 에서 함수와 동일한 개념.
		//js함수와 메서드의 차이점은 함수는 혼자서 동작하지만 메서드는 클래스의 멤버로서 동작함.
		//메서드 오버로딩 : 자바에서 동일한 이름의 메서드를 여러개 사용하는것
		//오버로딩 기준 1 : 매개변수의 타입이 다름.
		//		기준 2 : 매개변수의 개수가 다름
		
		//메서드실행 : 동일한 클래스 내에서 같은 멤버 메서드를 호출할 땐 메서드 명만 입력하여 호출가능
		//			다른 클래스에 있는 메서드를 호출할 땐 객체명.메서드명 형식으로 호출
		//메서드실행 1번방식으로 실행
		sum();
		sub();
		multi();
		div();
		
		
	}
	//사칙연산 메서드
	//1번함수방식으로 생성

	public static void sum() {
		//사칙연산 중 더하기를 하는 메서드
		//접근제한자 public : 외부에서도 접근 가능
		//static : 클래스가 메모리에 로드 시 같이 메모리에 로드 됨
		// 반환타입 void = 반환값 없음
		int a =20;
		int b = 20;
		System.out.println("변수 a와 b의 합 : "+a+" + "+b+" = "+(a+b));
		
	}
	
	public static void sub() {
		int a =20;
		int b =10;
		System.out.println("변수 a와 b의 차 : "+a+" - "+b+" = "+(a-b));
	}
	
	public static void multi() {
		int a = 20;
		int b = 10;
		System.out.println("변수 a와 b의 곱 : "+a+" * "+b+" = "+(a*b));
	}
	
	public static void div() {
		int a = 20;
		int b = 10;
		System.out.println("변수 a와 b의 나누기 : "+a+" / "+b+" = "+(a/b));
	}
}
