package chap03;

public class MethodDemo4 {

	public static void main(String[] args) {
		
		//메서드 오버로딩
		// 하나의 클래스에 동일한 이름의 메서드가 여러개 존재하는 것
		// 매개변수의 개수가 달라야 하고, 반환 타입, 데이터 타입이 달라야 함.
		
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
		//max(int n1, int n2)와 매개변수 개수는 동일하지만 매개변수의 데이터타입이 다르므로 오버로딩되서 다른메서드로 인식됨
		double result = 0;
//		result = n1 > n2 ? n1 : n2;
		if(n1 > n2) {
			result = n1;
		}
		return result;
	}
	public static int max(int n1, int n2, int n3) {
		//max(int n1, int n2)와 매개변수의 형태가 동일하지만 매개변수의 개수가 달라서 다른 메서드로 인식된다
		return max(max(n1,n2), n3);
	}
	public static void sum() {
		int a = 10;
		int b = 20;
		System.out.println("매개변수가 없는 메서드(함수) sum() " + (a + b));
	}
	public static void sum(int n1) {
		int b = 20;
		System.out.println("매개변수가 하나인 메서드(함수) sum(x) " +(n1 + b));
	}
	public static void sum(int n1, int n2) {
		System.out.println("매개변수가 두개인 메서드(함수) sum(x,y) " +(n1+n2));
	}
	public static void sum(int n1, int n2, int n3) {
		System.out.println("매개변수가 세개인 메서드(함수) sum(x,y,z) " +(n1+n2+n3));
	}
}
