package javaReview2;

public class Circle {

	private double PI;
	private int radius;
	
	//기본값을 설정해준 생성자
	public Circle() {
//		this.radius = 5;
//		this.PI=3.14; -> 여기까지가 기존 방식대로 멤버 변수에 값을 직접입력
		this(5, 3.14);
		//this()를 이용하여 소스를 간소화한것
		//this()를 이용하여 매개변수 2개받는 메서드로 넘겨줌
	}
	//사용자가 입력한 값을 사용하면서 프로그램 기본값도 사용
	//this()를 사용하여 사용자가 입력한 부분과 프로그램 기본값을 다른 생성자에서 실행
	public Circle(int radius) {
//		this.radius = radius;
//		this.PI=3.14;
		this(radius, 3.14);//this()를 이용하여 매개변수 2개받는 메서드로 넘겨줌
		
	}
	//모든 데이터를 사용자가 입력한 값을 사용하는 방식.
	public Circle(int radius, double PI) {
		//this()를 이용하여 소스를 간소화할 경우 오류 확률이 감소함, 유지보수가 쉬움
		this.radius = radius;
		this.PI= PI;
		
	}
	
	//기본 방식 : 객체를 이용하여 클래스 멤버 변수에 직접 접근하여 데이터를 입력 후 계산
	//멤버 클래스 변수에 private를 사용하여 캡슐화 했을경우 직접 접근이 불가능함.
	// getter, setter 를 이용해여 우회접근을 하거나 생성자를 이용하여 값을 설정
	public void area1() {
		System.out.printf("원의 넓이는 : %.2f\n", PI*radius);
	}
	
	
	
}
