package chap07;

public class CircleDemo {

	public static void main(String[] args) {

		Circle2 c1 = new Circle2(5.0);
		Circle2 c2 = new Circle2(6.0);
		
		if(c1.compareTo(c2) > 0) {
			System.out.println("첫 번째 원이 두 번째 원보다 크다");
		}
		else if(c1.compareTo(c2) == 0) {
			System.out.println("두 원의 크기가 같다");
		}
		else System.out.println("첫 번째 원이 두 번째 원보다 작다");
	}

}
//자바에서 기본으로 지원하는 인터페이스인 Comparable을 상속받아 사용해 객체를 비교
//인터페이스 Comparable 의 추상메서드 compareTo를 상속받아 오버라이딩하여 사용한다 
class Circle2 implements Comparable{
	double radius;
	
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	
	//Object는 자바에서 가장 큰 타입으로 자바의 모든 클래스는 Object 클래스가 조상임
	//Circle2의 객체 c2를 매개변수로 받아 Object o 에 저장
	//Object o 에 데이터가 저장되면 자동 타입변환이 발생함
	@Override
	public int compareTo(Object o) {
		Circle2 c = (Circle2)o;
		
		if(this.radius>c.radius) {
			return 1;
		}
		else if(this.radius == radius) {
			return 0;
		}
		else return -1;
	}
}

